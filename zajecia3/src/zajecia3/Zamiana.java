package zajecia3;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

public class Zamiana {
	public static StringBuffer LetterReplace(StringBuffer a, String b, String c)
	{
		StringBuffer changed = a;
		int pom = 0;
		while(0 < changed.indexOf(b,0)) {
			pom = changed.indexOf(b,0);
			changed.replace(pom, pom + 1, c);
		}
		return changed;
	}
	public static void Zmien(String  a) {
		StringBuffer text = new StringBuffer(a.toLowerCase());
		int i = 0, pom = 0;
		boolean sprawdz = false;
		char[] samogloska = {'a', 'e', 'y', 'u', 'i', 'o'};
		char[] spolgloska = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'w', 'y', 'z'};

		text = LetterReplace(text, "h", "");
		pom = 0;
		for(i = 0; i < text.length(); i++)
		{
			sprawdz = false;
			for(int j = 0; j < samogloska.length; j++)
			{
				if(text.charAt(i) == samogloska[j]) {
					sprawdz = true;
				}
			}
			
			if(sprawdz && pom>0) {
				text.replace(i, i+1, " ");
			}
			
			if(sprawdz) {
				pom++;
			} else {
				pom = 0;
			}
		}
		text = LetterReplace(text, " ", "");
		pom = 0;
		for(i = 0;i < text.length(); i++)
		{
			sprawdz = false;
			for(int j = 0; j < spolgloska.length; j++)
			{
				if(text.charAt(i) == spolgloska[j]) {
					sprawdz = true;
				}
			}
			if(sprawdz && pom > 0) {
				text.replace(i, i+1, " ");
			}
			if(sprawdz) {
				pom++;
			} else {
				pom = 0;
			}
		}
		
		text = LetterReplace(text, " ", "");
		text = LetterReplace(text, "i", "e");
		text = LetterReplace(text, "y", "e");
		text = LetterReplace(text, "p", "b");
		text = LetterReplace(text, "k", "c");
		text = LetterReplace(text, "s", "c");
		text = LetterReplace(text, "t", "d");
		text = LetterReplace(text, "j", "g");
		text = LetterReplace(text, "n", "m");
		text = LetterReplace(text, "w", "v");

		System.out.println(text);
}
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\memy\\zajecia3\\woah.txt");
		List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
		for(String line : a)
		{
			Zmien(line);
		}
	}
}
