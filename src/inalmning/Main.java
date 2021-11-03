package inalmning;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lines lines = new Lines();

		System.out.println("write words and write stop to finish");
		while (!lines.isStopped()) {
			String input = sc.nextLine();
			lines.calculate(input);
		}

		System.out.println(lines.getResult());
	}

}
