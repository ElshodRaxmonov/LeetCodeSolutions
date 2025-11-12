
/*  My Solution
     *  Runtime: 0ms
     *  Memory: 13.8MB
     */
int arraySign(vector<int> &nums)
{
    int sign = 1;

    for (
        int item : nums)
    {

        item == 0 ? sign = 0 : item < 0 &&sign < 0 ? sign = 1
                           : item < 0 && sign > 0  ? sign = -1
                                                   : sign = sign;
    }
    return sign;
}
/*  Chat gpt solution
     *  Runtime: 0ms
     *  Memory: 13.8MB
     */
int arraySign(vector<int> &nums)
{
    int sign = 1;

    for (
        int item : nums)
    {

        if (item == 0)
            return 0;
        if (item < 0)
            sign = -sign;
    }
    return sign;
}