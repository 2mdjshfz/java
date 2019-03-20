package zajecia4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean end = true;
			
		while(end)
		{
			menu();
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("1");
					break;
				case 2:
					System.out.println("2");
					break;
				case 3:
					System.out.println("3");
					break;
				case 4:
					System.out.println("4");
					break;
				case 5:
					System.out.println("ELO");
					end = false;
					break;
				default:
					System.out.println(":(");
			}
		}
	}

	private static void menu() {
		System.out.println("Hello sir! :)))");
		System.out.println("1. :)))");
		System.out.println("2. :)))");
		System.out.println("3. :)))");
		System.out.println("4. :)))");
		System.out.println("5. Wyjscie :)))");
	}

}
