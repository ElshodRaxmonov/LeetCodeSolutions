#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

/*  My Solution
   *  Runtime: 0ms
   *  Memory: 11.4MB
   */
vector<int> plusOne(vector<int> &digits)
{
    int number = 0;

    for (int i = digits.size() - 1; i >= 0; i--)
    {
        if (digits[i] == 9)
        {
            digits[i] = 0;
            continue;
        }
        else if (i == 0)
        {
            digits[i] = 1;
            digits.push_back(0);
            return digits;
        }
        else
        {
            digits[i] = digits[i] + 1;
            return digits;
        }
    }
    return digits;
}
/*  My Solution
   *  Runtime: 0ms
   *  Memory: 11.62MB
   */
vector<int> plusOne(vector<int> &digits)
{

for (int i = digits.size() - 1; i >= 0; i--)
    {
        if (digits[i]<9){
        digits[i]++;
        return digits;
    }
        digits[i] = 0;
    }
    digits.insert(digits.begin(), 1);
    return digits;}