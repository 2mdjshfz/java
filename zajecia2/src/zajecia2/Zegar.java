package zajecia2;
import java.io.*;

public class Zegar {
	public static void Oblicz(int a, int b, int c, int d) {
		int[] tab = {a, b, c, d};
		int i, j;
		int pom1 = 0, pom2 = 9;
		boolean end = true;
		String c1 = "none", c2 = "none", c3 = "none", c4 = "none";
		
		for(i = 2, end = true; (i >= 0) && (end); i--) {
			for(j = 0; (j < tab.length) && (end);j++) {
				if(tab[j] == i) {
					c1 = tab[j]+"";
					end = false;
					pom1 = tab[j];
					tab[j] = -1;
				}
			}
		}
		
		if(pom1 == 2) {
			pom2 = 3;
		} else {
			pom2 = 9;
		}
		
		for(i = pom2, end = true; (i >= 0) && (end); i--) {
			for(j = 0; (j < tab.length) && (end); j++) {
				if(tab[j] == i) {
					c2 = tab[j] + "";
					end= false;
					tab[j] = -1;
				}
			}
		}
		
		for(i = 5, end = true; (i >=0) && (end); i--) {
			for(j = 0; (j < tab.length) && (end); j++) {
				if(tab[j] == i) {
					c3 = tab[j]+"";
					end = false;
					tab[j] = -1;
				}
			}
		}
		
		for(i = 9, end = true; (i >=0) && (end); i--) {
			for(j = 0; j < (tab.length) && (end); j++) {
				if(tab[j] == i) {
					c4= tab[j]+"";
					end = false;
					tab[j] = -1;
				}
			}
		}
	    
		if((c1 == "none") || (c2 == "none") || (c3 == "none")) {
			System.out.println("Nie uda³o siê utworzyæ godziny");
		} else {
		System.out.println(c1+c2+":"+c3+c4);
		}
	}
	
	public static void main(String[] args) {
		Oblicz(7,5,1,2);
		Oblicz(0,0,0,0);
		Oblicz(9,9,9,9);
		Oblicz(0,9,0,9);
	}

}