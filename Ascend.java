// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c);
		System.out.println();
		int min = Math.min(a, b);
		int min2 = Math.min(min, c);
		System.out.print(min2 + " ");
		int max = Math.max(a,b);
		int max2 = Math.max(max,c);
		int middleNum = (a+b+c) - (max+min);
		System.out.print(middleNum + " ");
		System.out.println(max2);

	}
}
