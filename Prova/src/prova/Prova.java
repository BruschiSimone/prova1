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


		System.out.println(i);

		i += 1;
		System.out.println(i);

		System.out.print(i);
		System.out.println(" � la radice di " + x);

		i += i;
		System.out.println("il doppio della radice � " + i);

		i += 2*i;
		System.out.println("il triplo della radice � " + i);



		System.out.println("radice quarata " + i);
		i=Math.sqrt(x)*Math.sqrt(x);
		System.out.println("radice quarta " + i);


		i=x*x;
		System.out.println("quadrato " + i);

	}
}
