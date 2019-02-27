package zajecia2;
import java.util.Arrays;
import java.io.*;

public class Zegar {
	
	public static void Oblicz(int a, int b, int c, int d) {
		int[] tab = {a, b, c, d};
		Arrays.sort(tab);
		int jeden = 0, dwa = 0, trzy = 0, cztery = 0;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == 2) {
				jeden = tab[i];
				tab[i] = 99;
			}
			if(tab[i] == 1) {
				
			}
		}
		System.out.println("" + jeden + dwa + ":" + trzy + cztery);
	}
	
	public static void main(String[] args) {
		
		Oblicz(3, 5, 7, 2);
	}

}