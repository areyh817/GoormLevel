#include <stdio.h>
int main() {
	
	int base, high;
	double res;
	scanf("%d %d", &base, &high);
	
	res = (base * high) / 2;
	printf("%0.1lf", res);
	return 0;
}
