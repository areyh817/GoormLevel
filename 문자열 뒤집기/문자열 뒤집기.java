import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		for(int i = str.length()-1; i >= 0; i--) System.out.print(str.charAt(i));
	}
}