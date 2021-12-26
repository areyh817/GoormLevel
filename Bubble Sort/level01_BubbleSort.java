import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		// 입력 받은 수만큼 배열 생성
		int cnt = scan.nextInt();
		int[]num = new int[cnt];
		
		// num배열에 입력
		for(int i = 0; i < cnt; i++) num[i] = scan.nextInt();
		
		// 정렬한 것을 num배열에 다시 저장
		for(int i = 0; i < cnt; i++){
			for(int j = i + 1; j < cnt; j++){
			if(num[i] > num[j]){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				}
			}
		}
		
		
		// 출력
		for(int i = 0; i < cnt; i++) System.out.print(num[i] + " ");
		
	}
}