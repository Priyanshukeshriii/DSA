#include<iostream>
using namespace std;
int main() {
    int n =7;
    int arr[n] = {3,-4,5,4,-1,7,-8};
    int maxSum = INT32_MIN;
   for (int  start = 0; start < n; start++)
   {
    int currentSum = 0;
    for(int end = start ; end < n ; end++){
        currentSum += arr[end];
        maxSum = max(maxSum,currentSum);
    }
   }
   cout<<maxSum<<"\n";
   
return 0;
}