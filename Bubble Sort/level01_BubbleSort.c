#include <stdio.h>
int main() {
	int arrlength;
	scanf("%d", &arrlength);
	
	// 입력한 길이만큼 동적할당
	int * arr = (int *)malloc(sizeof(int)* arrlength);
	
	// arr 배열 0으로 초기화
	for(int i = 0; i < arrlength; i++) arr[i] = 0; 
	
	// 입력한 수들을 차례대로 배열방 안에 넣기
	int num;
	for(int i = 0; i < arrlength; i++){
		scanf("%d", &num);
		arr[i] = num;
	}
	
	// 정렬
	for(int i = 0; i < arrlength; i++){
		for(int j = i + 1; j < arrlength; j++){
			if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	// 정렬한 것을 출력
	for(int i = 0; i < arrlength; i++) printf("%d ", arr[i]); 
	
	return 0;
}
