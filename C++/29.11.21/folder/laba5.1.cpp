#include <iostream>
using namespace std;

int main()
{
    int n,m;
    cout << "Enter n: ";
    cin >> n >> m;
    int** arr = new int* [n];
    for (int i = 0; i < n; ++i)
        arr[i] = new int[m];

    cout << "Result\n";
    for (int i = 0;i < n; k++)
    {
        for (int j = 0; j <m; j++)
        {
            cin >> arr[i][j];
        }

    }
}