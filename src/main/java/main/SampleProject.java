package main;

public class SampleProject {
	//print  Hello world! in the console
	public static String printHello() {
		//print Hello world! in the console!
		String d = "Hello World!";
		return d;
	}
	public static int add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String args[]) {
		System.out.println(printHello());
		System.out.println(add(3,46));
	}
}