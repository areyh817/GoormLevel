import java.io.*;
import java.util.Scanner;
class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		// �Է� ���� ����ŭ �迭 ����
		int cnt = scan.nextInt();
		int[]num = new int[cnt];
		
		// num�迭�� �Է�
		for(int i = 0; i < cnt; i++) num[i] = scan.nextInt();
		
		// ������ ���� num�迭�� �ٽ� ����
		for(int i = 0; i < cnt; i++){
			for(int j = i + 1; j < cnt; j++){
			if(num[i] > num[j]){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				}
			}
		}
		
		
		// ���
		for(int i = 0; i < cnt; i++) System.out.print(num[i] + " ");
		
	}
}