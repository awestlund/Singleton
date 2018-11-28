package main.java;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);

		DbSingleton instance1 = DbSingleton.getInstance();
		System.out.println(instance1);
	}
}
