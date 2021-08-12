#include <stdio.h>
#include <math.h>
int main() {
	
	int sub[3];
	int sum = 0;
	double avg = 0;
	int num = 0;
	
	for(int i = 0; i < 3; i++) sub[i] = 0;
	
	for(int i = 0; i < 3; i++){
		scanf("%d", &num);
		sub[i] = num;
		sum += num;
	}

	char str = 0;
	avg = (double)sum / 3;
	
	if(avg>=90) str = 'A';
  else if(avg>=80) str = 'B';
  else if(avg>=70) str = 'C';
  else if(avg>=60) str = 'D'; 
  else str = 'F'; 
	
	printf("%0.2lf %c", round(avg * 100) / 100, str);
	
  
	
	
	return 0;
}
