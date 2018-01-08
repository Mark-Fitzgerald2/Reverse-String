package stringReverser;

import java.util.Arrays;
import java.util.Scanner;

public class Reverser {
	private static String string = "";
	public static void main(String[] args) {
		 System.out.println("Enter a string to reverse: ");
		 Scanner scanner = new Scanner(System.in);
		 string = scanner.nextLine();
		 System.out.println("If you want to reverse all characters, please press 1.\nIf you want to reverse the order of the words, please press 2.");
		 int i = scanner.nextInt();
		 if(i==1) {
			 System.out.println("String before reversal: " + string);
			 System.out.println("String aftre reversal: " + reverseString(string));
		 }
		 else if(i==2) {
			 System.out.println("String before reversal: " + string);
			 System.out.println("String aftre reversal: " + reverseWords(string));
		 } 
		 else if(i!=1 || i!=2) {
			 System.out.println("Please only enter an integer to the value of 1 or 2.");
		 }
		
	}
	
	private static String reverseWords(String string) {
		String[] array = string.split("\\s");
		return toString(array);
	}
	
	private static String toString(String[] array) {
		String toReturn = "";
		for(int i = array.length-1; i >= 0; i--) {
			toReturn = toReturn + " " + array[i];
		}
		return toReturn;
	}
	
	private static String reverseString(String string) {
		char[] array = string.toCharArray();
		int begin = 0;
		int end = array.length-1;
		char temp;
		while(end>begin) {
			temp = array[begin];
			array[begin] = array[end];
			array[end] = temp;
			end--;
			begin++;
		}
		return new String(array);
	}
}
