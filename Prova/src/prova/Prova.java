package prova;
import java.util.Scanner;

public class Prova {
	public static void main (String[] args) {
		Scanner e = new Scanner(System.in);
		double i;
		System.out.println("Inserisci il numero di cui vuoi trovare la radice:");
		int x = e.nextInt();
		e.close();
		i=Math.sqrt(x);
		System.out.print(i);
		System.out.println(" � la radice di " + x);
	}
}
