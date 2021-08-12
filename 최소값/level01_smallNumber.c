#include <stdio.h>
int main() {
	int arrlength, min;
	scanf("%d", &arrlength);
	
	// 입력한 사이즈만큼 동적할당
	int* arr = (int *)malloc(sizeof(int)*arrlength);
	
	// 원소 입력
	for(int i = 0; i < arrlength; i++){
		int num;
		scanf("%d ", &num);
		arr[i] = num;
	}
	
	min = arr[0];
	for(int i = 0; i < arrlength; i++){
		if(arr[i] < min) min = arr[i];
	}
	
	printf("%d", min);
	return 0;
}
