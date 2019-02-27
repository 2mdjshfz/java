package com.ap.michal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double a, b, pole;
		Scanner scan = new Scanner(System.in);
		System.out.print("Podaj a: ");
		a = scan.nextDouble();
		System.out.print("Podaj b: ");
		b = scan.nextDouble();
		pole = a * b;
		System.out.println("Pole = " + pole);
	}
}
