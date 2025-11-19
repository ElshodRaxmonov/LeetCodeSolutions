
#include <iostream>
using namespace std;

    /*  My Solution
     *  Runtime: 0ms
     *  Memory: 9.82MB
     */
int lengthOfLastWord(string s)
{

    string currentWord = "";
    string lastWord = "";
    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] != ' ')
        {
            currentWord += s[i];
            lastWord = "";
            if (i == s.length() - 1)
            {
                return currentWord.size();
            }
            if (s[i + 1] == ' ')
            {
                lastWord = currentWord;
                currentWord.clear();
            }
        }
        else
        {
            continue;
        }
    }
    return lastWord.length();
}
/*  My Solution more optimal
     *  Runtime: 0ms
     *  Memory: 8.99MB
     */
int lengthOfLastWord(string s)
{
    string currentWord = "";

    for (int i = s.length() - 1; i >= 0; i--)
    {
        if (s[i] != ' ')
        {
            currentWord += s[i];
        }
        else
        {
            if (currentWord != "")
            {
                return currentWord.length();
            }
            continue;
        }
    }
    return currentWord.length();
}
   /*  GPT Solution
     *  Runtime: 0ms
     *  Memory: 8.90MB
     */
int lengthOfLastWord(string s){
int i = (int)s.size() - 1;

    // skip trailing spaces
    while (i >= 0 && s[i] == ' ') --i;

    // count characters of the last word
    int len = 0;
    while (i >= 0 && s[i] != ' ') { ++len; --i; }

    return len;
    }

