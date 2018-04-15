package Warsztaty_1_1;

import java.util.Random;
import java.util.Scanner;

import pl.coderslab.myTools;

public class Warsztaty_1_1_Gra_1 {

		public static void main(String[] args) {
			Random generator = new Random();
			int number = generator.nextInt(100)+1;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Wpisz swoje imię:");
			String name = scan.nextLine();
			
			System.out.println(name + ", zgadnij liczbę od 1 do 100");
			
			int n = 0;
			
			while(n != number) {
				n = myTools.inputMoreZeroWarsztat_1_1();
				if (n < number) {
					System.out.println("Za mało!!!");
					
				}else if (n > number){
					System.out.println("Za dużo!!!");
					
				}
			}
			System.out.println("Z G A D Ł E Ś!!!");
		}
	}
