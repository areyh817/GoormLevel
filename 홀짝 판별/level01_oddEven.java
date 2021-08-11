import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) System.out.print("even");
		else System.out.print("odd");
	}
}