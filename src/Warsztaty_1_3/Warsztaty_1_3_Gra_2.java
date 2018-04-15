package Warsztaty_1_3;

import java.util.Scanner;

public class Warsztaty_1_3_Gra_2 {

	public static void main(String[] args) {
		
		System.out.println("Pomyśl liczbę od 0 do 1000, a ja zgadnę ją maksymalnie za 10 prób");
		System.out.println("Jak będziesz gotowy - nacisni dowolną klawisze i ENTER");
		Scanner scan = new Scanner(System.in);
		String ready = scan.next();
		
		int min = 0, max = 1001, count = 0;
		String answer ="jhj jhjhj";
		
		while (!(answer.equals("z"))) {
	    	count += 1;
			int guess = ((max - min) / 2) + min;
		    System.out.println("Zgaduję" + " " + guess + " (" + count + " " + "próba)");
		
		    System.out.println("Wpisz w konsoli: m (mniej), w (wiecej), z (zgadles)");
		
		    answer = scan.next();
		    while (true) {
		    	if (answer.equals("z")) {
		    		System.out.println("WYGRAŁEM !!!");
		    		break;
		    	} else if (answer.equals("m")) {
		    		max = guess;
		    		break;
		    	}else if (answer.equals("w")) {
		    		min = guess;
		    		break;
		    	}else 
		    		System.out.println("Podałeś błędną odpowiedź, nie oszukuj mnie!!! Tylko m (mniej), w (wiecej), z (zgadles)");
		    	    System.out.println("Zgaduję" + " " + guess + " (" + count + " " + "próba)");
					answer = scan.next();
			}
		}
	}
}
