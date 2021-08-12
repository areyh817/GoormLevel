import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		
		if(year % 4 == 0 || year % 400 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0) System.out.print("Leap Year");
				else System.out.print("Not Leap Year");
		} 
		else System.out.print("Leap Year");
		} 
		else System.out.print("Not Leap Year");
	
	}
}