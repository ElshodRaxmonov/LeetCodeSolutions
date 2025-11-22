#include <iostream>
#include <vector>
#include <string>
using namespace std;

  /*  My Solution first attempt
     *  Runtime: 0ms
     *  Memory: 12.02MB
     */

int calPoints(vector<string> &operations)
{
     std::vector<int> st;
    st.reserve(operations.size());   // small optimization
    int sum = 0;

    for (const auto &op : operations) {
        if (op == "C") {
            if (!st.empty()) {
                sum -= st.back();
                st.pop_back();
            }
        } else if (op == "D") {
            int x = st.back() * 2;
            st.push_back(x);
            sum += x;
        } else if (op == "+") {
            int x = st.back() + st[st.size() - 2];
            st.push_back(x);
            sum += x;
        } else { // numeric
            int x = std::stoi(op);
            st.push_back(x);
            sum += x;
        }
    }
    return sum;
}


