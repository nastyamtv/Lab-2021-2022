#include <iostream>
using namespace std;

int main()
{
    int n, m;
    int quant = 0;
    int column = 0;
    int temp = 0;
    int quant_colum = 0;
    cout << "enter the size of the array: ";
    cin >> n >> m;
    bool b = false;
    int** arr = new int* [n];
    for (int i = 0; i < n; ++i)
        arr[i] = new int[m];

    cout << "Enter array:\n";
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> arr[i][j];
        }

    }
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (arr[i][j] == 0)
                b = true;
        }
        if (b == true)
        {
            quant++;
            b = false;
        }
    }
    cout << "Quant: " << quant;
    for (int i = 0; i < n; i++)
    {
        for (int j = 1; j < m; j++)
        {
            if (arr[i][j] == arr[i][j - 1])
            {
                temp++;
            }
            else
            {
                if (quant_colum < temp)
                {
                    quant_colum = temp;
                    temp = 0;
                    column = i;
                }
            }
        }
    }
    cout << "\tResult: " << column;
}