#include <iostream>
using namespace std;

/*  My Solution
   *  Runtime: 0ms
   *  Memory: 8.1MB
   */

string toLowerCase(string s)
{

    for (char& c : s)
    {
        if(c>='A' && c<='Z'){
            c = static_cast<char>(c+32);
        }
    }
    return s;
}

/*  Solution tolower function
   *  Runtime: 0ms
   *  Memory: 8.2MB
   */

string toLowerCase(string s)
{

    for (char &c : s)
    {

        c = tolower(static_cast<unsigned char>(c));
    }
    return s;
}
/*  Solution bitwise operator
   *  Runtime: 0ms
   *  Memory: 8.3MB
   */

string toLowerCase(string s)
{

    for (char &c : s)
    {
        if( c>= 'A' && 'Z' <=c ){
                 c |= 32;
        }
    }
    return s;
}

