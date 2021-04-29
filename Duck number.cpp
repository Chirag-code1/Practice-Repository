
#include <iostream>
using namespace std;

bool check_duck(string num)
{
	int i = 0, n = num.length();
	while (i < n && num[i] == '0')
		i++;


	while (i < n) {
		if (num[i] == '0')
			return true;
		i++;
	}

	return false;
}

int main(void)
{
	string num = "1023";
	if (check_duck(num))
		cout << "It is a duck number\n";
	else
		cout << "It is not a duck number\n";

	return 0;
}
