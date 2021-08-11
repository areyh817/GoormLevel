import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int input, res = 0;
		input = scan.nextInt();
		
		for(int i = 1; i < input; i++){
			res += i;
		}
		
		System.out.print(res);
	}
}