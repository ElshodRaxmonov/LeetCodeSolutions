#include <iostream>
#include <stdio.h>
#include <vector>
using namespace std;

  /*  My Solution first attempt
     *  Runtime: 0ms
     *  Memory: 10.3MB
     */
bool judgeCircle(string moves)
{
    int x = 0;
    int y = 0;
    for (char m : moves)
    {
        switch (m)
        {
        case 'L':
            --x;
            break;
        case 'R':
            ++x;
            break;
        case 'U':
            ++y;
            break;
        case 'D':
            --y;
            break;
        }
    }
    return x == 0 && y == 0;
}


