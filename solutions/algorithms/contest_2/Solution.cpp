  /*  My Solution
     *  Runtime: 0ms
     *  Memory: 15.05MB
     */
int minLengthAfterRemovals(string s)
{

    int numA = 0, numB = 0;
    for (char c : s)
    {
        (c == 'b') ? numB++ : numA++;
    }
    return abs(numA - numB);
}