/*
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, World! ");
		System.out.print("Hello, World! ");
		System.out.println("  Difference between println and print");
		System.out.print("User name is JJH");
	}

}
*/

public class Hello {
	public static int sum(int n, int m) {
		return n+m;
	}
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}