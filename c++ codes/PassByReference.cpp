#include<iostream>
using namespace std;
void maketwice(int arr[],int size){
for ( int i = 0; i < size; i++)
{
    arr[i] = arr[i]*2;
    cout<<arr[i]<<"\n";
}
}

int main() {
   int arr[] = {1,2,3,4,5};

   maketwice(arr,5);
return 0;
}