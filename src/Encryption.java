import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Encryption {
	
	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;
	
	Encryption(){
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList();
		shuffledList = new ArrayList();
		character = ' ';
		
		newKey();
		askQuestion();
	}
	
	private void askQuestion(){
		while(true) {
			System.out.println("***************************************************");
			System.out.println("What do you want to do");
			System.out.println("(N)ew Key, (G)et Key, (E)ncrypt, (D)ecrypt, (Q)uit");
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			
			switch(response) {
			case 'N':
				newKey();
				break;
			case 'G':
				getKey();
				break;
			case 'E':
				encrypt();
				break;
			case 'D':
				decrypt();
				break;
			case 'Q':
				quit();
				break;
			default:
				System.out.println("Not a valid answer");
			}
		}
	}
	
	private void newKey() {
		
	}
	
	private void getKey() {
		
	}
	
	private void encrypt() {
		
	}
	
	private void decrypt() {
		
	}
	
	private void quit() {
		
	}
	
}
