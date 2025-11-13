#include <iostream>
#include <stdio.h>
#include <vector>
using namespace std;

  /*  My Solution first attempt
     *  Runtime: 0ms
     *  Memory: 12.68MB
     */
bool canMakeArithmeticProgression(vector<int> &arr)
{

    sort(arr.begin(), arr.end()); // added to use the sort function
    int diff = arr[1] - arr[0];
    int n = arr.size();
    for (int i = 2; i < n; i++){
        if (arr[i] - arr[i - 1] != diff)
            return false;
    }

    return true;
}