#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;


int main()
{

	cout << "Enter stirng: ";
	string str;
	cin >> str;
	for(int i=0; i<str.length(); i++)
		str[i]=tolower(str[i]);
	cout << "Result: " << str;
}
