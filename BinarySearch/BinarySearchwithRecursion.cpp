#include<iostream>
#include<vector>
using namespace std;
int binarySearch(vector<int> arr ,int tar , int st , int end){
if(st<=end){
    int mid = st +(end - st)/2;
    if(arr[mid] > tar){
        return binarySearch(arr , tar , st , mid-1);
    }
    else if(arr[mid] < tar){
        return binarySearch(arr , tar , mid+1 , end);
    }
    else{
        return mid;
    }
}
return -1;
}
int main() {

    vector<int> arr = {1,2,3,4,5,6,7,12,14,15,16,17};
    cout<<binarySearch(arr ,  2 , 0 , arr.size()-1)<<"\n";
    
return 0;
}