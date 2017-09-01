package hw;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("args = " + Arrays.asList(args));
		final HelloWorld instance = new HelloWorld();
		System.out.println(instance.getMessage());
		System.out.println(instance.getYear());
	}
}
