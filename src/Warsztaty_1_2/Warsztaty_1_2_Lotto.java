package Warsztaty_1_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import pl.coderslab.myTools;

public class Warsztaty_1_2_Lotto {

	public static void main(String[] args) {
		//Blok wprowadzenia użytkownikiem liczb 
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj 6 różnych całkowitych liczb od 1 do 49");
		
		int [] myNumbers = new int [6];
		for (int i = 0; i < myNumbers.length; i++) {
			myNumbers[i] = myTools.inputMoreZeroWarsztat_1_2();//metoda myTools.inputMoreZeroWarsztat_1_2 nie pozwala wprowadzić ujemną liczbę, tekst oraz liczbę powyżey 49 
			for (int j = 0; j < myNumbers.length; j++) {
				if ((myNumbers[i] == myNumbers[j]) && i != j) {//sprawdzenie czy taka liczba nie była worowadzona wcześniej
					System.out.println("Taka liczba już była podana, sprobuj inną");
					i--;
					break;
				}
			}
		}
		//Posortowane drukowanie wprowadzonych liczb 
		Arrays.sort(myNumbers);
		System.out.println("Twoje liczby " + Arrays.toString(myNumbers));
		
		//Blok losowania liczb od 1 do 49
		Random generator = new Random();
		int [] randNumbers = new int[6];
		for (int i = 0; i <randNumbers.length; i++) {
			randNumbers[i] = generator.nextInt(49)+1;
			for (int j = 0; j < randNumbers.length; j++) {
				if ((randNumbers[i] == randNumbers[j]) && i != j) {//sprawdzenie czy taka liczba nie była wylosowana wcześniej
					i--;
					break;
				}
			}
		}
		//Posortowane drukowanie losowych liczb 
		Arrays.sort(randNumbers);
		System.out.println("Wylosowano " + Arrays.toString(randNumbers));
		
		//Blok sprawdzenia wprowadzonych i wylosowanych liczb
		int guess = 0;
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < randNumbers.length; j++) {
				if (myNumbers[i] == randNumbers[j]) {
					guess += 1;//ilość trafienia
				}
			}
		}
		
		//Blok druku wyników
		if (guess >= 3) {
			System.out.println("GRATULACJE!!! Zgadłeś" + " " + guess + " " + "numery(ów)");
		}else if (guess == 2 || guess == 1){
			System.out.println("Niestety, nic nie wygrałeś - trafiłeś tylko" + " " + guess + " " + "raz(y)");
		}else {
			System.out.println("Niestety, nic nie wygrałeś - nie zgadłeś żadnego numeru");
		}
	}
}