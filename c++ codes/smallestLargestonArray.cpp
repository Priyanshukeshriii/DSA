#include<iostream>
using namespace std;
int main() {
   int largest = INT32_MIN;
   int smallest = INT32_MAX;
   int nums[5] = {1,2,3,4,5};
   for (int i = 0 ; i < sizeof(nums)/sizeof(nums[0]); i++)
   {
    // if(nums[i]>largest){
    //     largest = nums[i];
    // }
    largest = max(largest,nums[i]);
    if (nums[i] < smallest)
    {
        smallest = nums[i];
    }
    
    
   }
   cout<<"The largest number is "<<largest<<"\n";
   cout<<"The smallest number is "<<smallest<<"\n";
   
return 0;
}