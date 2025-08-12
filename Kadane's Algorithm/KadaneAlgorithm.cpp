#include<iostream>
using namespace std;
int main() {
    int n = 7 ;
    int arr [7] = {3,-4,5,4,-1,7,-8};
    int maxsum = INT16_MIN;
    int currentsum = 0;
   for(int i =0 ;i<n ; i++){
    currentsum += arr[i];
    maxsum = max(maxsum, currentsum);
    if (currentsum < 0){
        currentsum = 0;
    }
   }
   cout<<maxsum<<"\n";
return 0;
}