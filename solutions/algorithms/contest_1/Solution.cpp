  /*  My Solution
     *  Runtime: 0ms
     *  Memory: 30.89MB
     */
  int maximizeExpressionOfThree(vector<int>& nums) {
       int a = INT_MIN;
    int b = INT_MIN;
    int c = INT_MAX;
    int answer = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] > b)
        {
            if (nums[i] > a)
            {
                b = a;
                a = nums[i];
            }
            else if (nums[i] > b)
            {
                b = nums[i];
            }
        }

        if (c > nums[i])
        {
            c = nums[i];
        }
    }

    return a+b-c;
    }
      /*  GPT Solution
         *  Runtime: 0ms
         *  Memory: 31.13MB
         */
      int maximizeExpressionOfThree(vector<int>& nums) {
              int max1 = INT_MIN, max2 = INT_MIN;
          int min1 = INT_MAX;

          for (int x : nums)
          {
              // Update max1 & max2
              if (x > max1)
              {
                  max2 = max1;
                  max1 = x;
              }
              else if (x > max2)
              {
                  max2 = x;
              }

              // Update min1
              min1 = min(min1, x);
          }

          return max1 + max2 - min1;
          }