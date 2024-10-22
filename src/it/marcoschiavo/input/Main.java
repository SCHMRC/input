package it.marcoschiavo.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader keybord = new BufferedReader(stream);
		byte x = 0;
		try {
			System.out.println("Inserisci il valore numero 1");
			String uno = keybord.readLine();
			System.out.println("Inserisci il valore numero 2");
			String due = keybord.readLine();
			System.out.println("Inserisci il valore numero 3");
			String tre = keybord.readLine();
			
		}catch(Exception e) {
			
		}
		
		
//		try {
//			int somma = 0 ;
//			final int COSTANTE = 3 ;
//			for(int i = 0 ; i < COSTANTE ; i++) {
//				System.out.print("Immetti eta " + (i + 1) + ": ");
//				String valore = keybord.readLine();
//				int temp = Integer.parseInt(valore);
//				somma += temp;
//			}
//			int media = somma / COSTANTE;
//			System.out.println(media);
//		}catch(IOException x) {
//			System.err.println(x.getMessage());
//		}
		
	}
	
	//variante con la classe scanner
//	public static void main(String args[]) {
//		String nome;
//		Scanner scanner = new Scanner(System.in);
//		nome = scanner.next();
//	}

}
