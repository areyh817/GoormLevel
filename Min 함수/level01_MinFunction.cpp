#include <iostream>
using namespace std;
int main() {
	int num1, num2;
	cin >> num1 >> num2;
	
	cout << min(num1, num2);
	return 0;
}

int min(int num1, int num2){
	if(num1 < num2) return num1;
	else return num2;
}