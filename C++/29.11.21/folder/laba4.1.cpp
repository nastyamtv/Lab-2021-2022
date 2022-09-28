#include <iostream>
#include <iomanip>
using namespace std;
double Function(double a, double b, double c, double x)
{
	if ((x - 1 < 0) && (b - x != 0))
		return a * x * x + b;
	if ((x - 1 > 0) && (b + x == 0))
		return (x - a) / x;
	return x / c;
}
int main()
{
	cout << "Enter a, b, c, x_start, x_finish, step: ";
	double a, b, c, x_s, x_f, step,x;
	cin >> a >> b >> c >> x_s >> x_f >> step;
	cout << "|------------------------|" << endl;
	cout << "|";
	cout.width(10);
	cout << left << " value x" << setw(4) << "|" << setw(10) << "Function" << "|" << "\n";
	cout << "|------------------------|" << endl;
	for (double i = x_s; i <= x_f; i = i + step)
	{
		cout << "|  ";
		cout.width(8);
		cout << left << i << setw(4) << "|" << setw(10) << Function(a, b, c, i) << "|" << "\n";
	}
	cout << "|------------------------|" << endl;
}