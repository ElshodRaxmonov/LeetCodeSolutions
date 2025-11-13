#include <iostream>
#include <vector>

using namespace std;

vector<int> getConcatenation(vector<int> &nums)
{
    int sizeArray = nums.size();
    vector<int> newArray(2 * sizeArray);
    newArray=nums;
    for (int i = 0; i <nums.size();  i++)
    {
        newArray.push_back(nums[i]);
    }
    return newArray;
}

vector<int> getConcatenation(vector<int> & nums)
    {
        int sizeArray = nums.size();
        vector<int> newArray(2 * sizeArray);

        for (int i = 0; i < sizeArray; i++)
        {

            newArray[i] = nums[i];
            newArray[i + sizeArray] = nums[i];
        }
        return newArray;
    }
}