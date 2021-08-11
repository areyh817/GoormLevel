#include <iostream>
using namespace std;
int main() {
	int input, res = 0;
	cin >> input;
	
	for(int i = 1; i < input; i++){
		res += i;
	}
	cout << res;
	return 0;
}