#include <stdio.h>
int main() {
	int num1, num2;
	
	scanf("%d %d", &num1, &num2);
	printf("%d", min(num1, num2));
}

int min(int num1, int num2){
	if(num1 < num2) return num1;
	else return num2;
}
