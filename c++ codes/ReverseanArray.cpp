#include<iostream>
using namespace std;
void reverArray(int arr[] , int size,int start =0 ,int end = -1){
    if(end == -1){
        end = size - 1;
    }
    while (start< end)
    {
        int temp = arr[start];
        arr[start++] =arr[end];
        arr[end--] = temp;
    }
    

}

int main() {
   int arr[] = {1,2,3,4,5};
   reverArray(arr,5);
//    reverArray(arr, 5,0,2);//these are the step to rotate an array
//    reverArray(arr,5,3);
   for(int i = 0; i<5; i++){
    cout<<arr[i]<<"\n";
   }
return 0;
}