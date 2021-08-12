import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.print(min(num1, num2));
	
	}
	
	static int min(int num1, int num2){
		if(num1 < num2) return num1;
		else return num2;
	}
}