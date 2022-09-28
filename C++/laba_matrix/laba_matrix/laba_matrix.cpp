#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter n: ";
    cin >> n;
    int m = n;
    int t = 1;
    int** arr = new int* [n];
    for (int i = 0; i < n; ++i)
        arr[i] = new int[m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            arr[i][j] = 0;
        }
    }
    int temp = 1;
    
    for (int j = 0; j < n/2; j++)
    {
        for (int i = 1+j; i+j <= n-2; i++)
        {
            arr[i][j] = temp;
            temp++;
        }
    }
    int x=0;
    if (n % 2 == 0)
    {
        x++;
    }
    int k = 0;
    for (int j = n/2+1; j <n; j++)
    {
        for (int i = n-j; i+j<=n+k+x; i++)
        {
            arr[i][j] = temp;
            temp++;
        }

        k = k + 2;
    }

    cout << "Result\n";
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << "\t";
        }
        cout << endl;
    }
}
