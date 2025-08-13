#include<iostream>
#include<vector>
using namespace std;
int binarysearch(vector<int> arr, int tar){
    int st = 0 , end = arr.size() - 1;
    int pos = -1;

    while (st <= end)
    {
        int mid = (st + end )/2;
        if (arr[mid] == tar)
        {
            pos = mid;
            return pos;
        }
        else if(arr[mid] > tar){
            end = mid-1;
        }
        else if (arr[mid]<tar){
            st = mid +1;
        }
        
    }
    return pos;
    
}
int main() {
    vector<int> arr = {1,2,3,4,5,12,13,14,15,16,25,26,27};
    cout<<"the index of target is "<<binarysearch(arr, 12) <<"\n";

return 0;
}