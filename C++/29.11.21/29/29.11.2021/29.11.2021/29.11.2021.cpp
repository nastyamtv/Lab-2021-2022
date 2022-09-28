#include <iostream>
#include <string>
using namespace std;

int main()
{
	bool b = false;
	int q = 0;
	int quantity = 0;
	string str;
	cout << "Enter string: " << endl;
	getline(cin, str);
	//int n = str.length();
	cout << "Text after :" << endl;
	for (int i = 0; i < str.length(); i++)
	{
		
		if (b == true)
		{
			cout << str[i];
		}
		if (str[i] == ':')
		{
			b = true;
		}
	}
	b = false;
	for (int i = 0; i < str.length(); i++)
	{
		if (str[i] == ' ')
		{
			q++;
		}
		if (str[i] == '.')
		{
			q++;
			if (q % 2 == 1)
				quantity++;
			q = 0;
		}
	}
	cout << endl;
	cout <<"Qauntity: " << quantity<<endl;
	cout << "New string:" << endl;
	for (int i = 0; i < str.length(); i++)
	{
		if (str[i] != ',')
			cout << str[i];
		else
			break;
	}
}