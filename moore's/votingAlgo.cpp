
//Majority element > n/2

#include<iostream>
#include<vector>
using namespace std;
int main() {
    vector<int> nums ={1,2,2,1,2};
    int candidate = nums[0];
    int freq =0;
    for(int i =0; i < nums.size(); i++){
        if(freq == 0){
            candidate = nums[i];
            
        }
        if (candidate == nums[i])
        {
            freq++;
        }else {
            freq--;
        }
        
    }
    cout<<candidate<<"\n";
return 0;
}