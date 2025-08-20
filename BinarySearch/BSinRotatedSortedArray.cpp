#include<iostream>
#include<vector>
using namespace std;
int bsinrotatedsortedarray(vector<int> arr ,int tar){
    int st = 0 , end = arr.size()-1;
    while (st <= end)
    {
        int mid = st + (end- st) /2;
        if(arr[mid] == tar){
                return mid;
        }
        if( arr[mid] > arr[st]){
            if(arr[st] <= tar && tar <= mid ){
                end =mid;
            }
            else{
                st = mid;
            }
        }else{
            if(arr[mid]<= tar && tar<= arr[end]){
                st = mid;
            }else{
                end = mid;
            }
        }
        
    }
    return -1;
    
}
int main() {
    vector<int> arr ={5,6,7,8,9,1,2,3,4};
    int tar = 3;
    cout<<bsinrotatedsortedarray(arr, tar)<<"\n";
return 0;
}