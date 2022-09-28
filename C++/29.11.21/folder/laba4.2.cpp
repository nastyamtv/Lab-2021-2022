#include <iostream>
#include <iomanip>
using namespace std;
int main()
{
	cout << "Enter a, b, c, x_start, x_finish, step: ";
	double a, b, c, x_s, x_f, step;
	double temp = 0;
	cin >> a >> b >> c >> x_s >> x_f >> step;
	cout << "|------------------------|" << endl;
	cout << "|";
	bool t = false;
	cout.width(10);
	cout << left << " value x" << setw(4) << "|" << setw(10) << "Function" << "|" << "\n";
	cout << "|------------------------|" << endl;
	for (double i = x_s; i <= x_f; i = i + step)
	{
		if ((i - 1 < 0) && (b - i != 0)) {
			temp = a * i * i + b;
			t = true;
		}
		if ((i - 1 > 0) && (b + i == 0)) {
			temp = (i - a) / i;
			t = true;
		}
		if (t == false)
			temp = i / c;
		cout << "|  ";
		cout.width(8);
		cout << left << i << setw(4) << "|" << setw(10) << temp << "|" << "\n";
		t = false;
	}
	cout << "|------------------------|" << endl;
}