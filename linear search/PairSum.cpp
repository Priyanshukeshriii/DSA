#include<iostream>
#include<vector>
using namespace std;
vector<int> pairSum(vector<int> nums ,int target){
    vector<int> ans;
    int i =0;
    int j = nums.size();
    while (i<= j)
    {
        int currentSum = nums[i] + nums[j];
        if(currentSum < target){
            i++;
        }else if (currentSum> target){
            j--;
        }else if (currentSum == target){
            ans.push_back(i);
            ans.push_back(j);
            return ans;
        }
    }
    return ans;
    
}
int main() {
    vector<int> nums = {2,7,11,15};
    int target = 18;
    for(int num : pairSum(nums,target)){
        cout<<num<<"\n";
    }
   
return 0;
}