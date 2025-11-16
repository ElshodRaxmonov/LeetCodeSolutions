  /*  My Solution
     *  Runtime: 0ms
     *  Memory: 10.01MB
     */
#include <iostream>
#include <string>

using namespace std;

int eachNumber(char ch, char next)
{
    switch (ch)
    {
    case 'I':
        if (next == 'V' || next == 'X')
        {
            return -1;
        }
        return 1;
        break;
    case 'V':
        return 5;
        break;
    case 'X':
        if (next == 'L' || next == 'C')
        {
            return -10;
        }
        return 10;
        break;
    case 'L':
        return 50;
        break;
    case 'C':
        if (next == 'D' || next == 'M')
        {
            return -100;
        }
        return 100;
        break;
    case 'D':
        return 500;
        break;
    case 'M':
        return 1000;
        break;
    }
    return 0;
}
int romanToInt(string s)
{
    int number = 0;
    for (int i = 0; i < s.size() - 1; i++)
    {
        number += eachNumber(s[i], s[i + 1]);
    }
    number += eachNumber(s[s.size() - 1], '\0');
    return number;
}
  /*  My Solution with cleaner format

     *  Runtime: 0ms
     *  Memory: 9.87MB
     */
        int eachNumber(char ch)
{
    switch (ch)
    {
    case 'I':

        return 1;
        break;
    case 'V':
        return 5;
        break;
    case 'X':

        return 10;
        break;
    case 'L':
        return 50;
        break;
    case 'C':
        return 100;
        break;
    case 'D':
        return 500;
        break;
    case 'M':
        return 1000;
        break;
    }
    return 0;
}
public:
int romanToInt(string s)
{
    int number = 0;
    for (int i = 0; i < s.size(); i++)
    {
        if (i + 1 < s.size() && eachNumber(s[i]) < eachNumber(s[i + 1]))
        {
            number -= eachNumber(s[i]);
        }
        else
        {
            number += eachNumber(s[i]);
        }
    }
    return number;
}

  /* GPT solution with map

     *  Runtime: 12ms
     *  Memory: 13.51MB
     */

     int romanToInt(string s) {
         unordered_map<char, int> val = {
             {'I', 1}, {'V', 5}, {'X', 10},
             {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}
         };

         int result = 0;
         for (int i = 0; i < s.size(); i++) {
             if (i + 1 < s.size() && val[s[i]] < val[s[i + 1]]) {
                 result -= val[s[i]];      // subtract
             } else {
                 result += val[s[i]];      // add
             }
         }
         return result;
     }
      /* GPT solution with map faster

          *  Runtime: 0ms
          *  Memory: 11.26MB
          */
         int romanToInt(string s) {
           int val[256] = {};
         val['I'] = 1;
         val['V'] = 5;
         val['X'] = 10;
         val['L'] = 50;
         val['C'] = 100;
         val['D'] = 500;
         val['M'] = 1000;

         int ans = 0;
         for (int i = 0; i < s.size(); i++) {
             if (i+1 < s.size() && val[s[i]] < val[s[i+1]])
                 ans -= val[s[i]];
             else
                 ans += val[s[i]];
         }
         return ans;
         }