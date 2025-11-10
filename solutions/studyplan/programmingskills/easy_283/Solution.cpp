#include <iostream>
#include <stdio.h>
#include <vector>
using namespace std;

  /*  My Solution first attempt
     *  Runtime: 294ms
     *  Memory: 23.88MB
     */
void moveZeroes(vector<int> &nums)
{
    int count = 0;
    for (int i : nums)
    {
        if (i == 0)
        {
            count++;
        }
    }

    while (count > 0)
    {
        for (int x = 1; x < nums.size(); x++)
        {
            if (nums[x - 1] == 0)
            {
                int temp = nums[x - 1];
                nums[x - 1] = nums[x];
                nums[x] = temp;
            }
        }
        count--;
    }
}
 /*  CHatGpt Solution with swap
     *  Runtime: 0ms
     *  Memory: 23.94MB
     */
void moveZeroes(vector<int> &nums)
{
     int lastNonZero = 0;
      for (int i = 0; i < (int)nums.size(); ++i)
      {
          if (nums[i] != 0)
          {
              if (i != lastNonZero)
                  std::swap(nums[lastNonZero], nums[i]);
              ++lastNonZero;
          }
      }
}


