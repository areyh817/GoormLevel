import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.print(num1 / num2 + " " + num1 % num2);
	}
}