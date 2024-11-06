// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		//Generates 3 random numbers between 0 to 1, times it by the limit so that it will be
		//in the limit range and not stay in the Math.random range
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);

		System.out.println(a + " " + b + " " + c);

		//Finding the smaller number between the first two numbers
		int min = Math.min(a, b);
		//Find the smaller number between the minimum of the first two numbers, and the third number
		int minResult = Math.min(min, c);
		
		//Finding the bigger number between the first two numbers
		int max = Math.max(a,b);
		//Find the bigger number between the maximum of the first two numbers, and the third number
		int maxResult = Math.max(max,c);
		//Take the sum of the 3 random numbers and deduct the sum of the maximum and the minimum numbers
		int middleNum = (a+b+c) - (max+min);

		System.out.println(minResult + " " + middleNum + " " + maxResult);


	}
}
