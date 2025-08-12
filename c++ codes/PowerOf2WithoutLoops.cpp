#include<iostream>
using namespace std;
int main() {
   int num ;
   bool isPower = true;
   cout<<"Enter the number : "<<"\n";
   cin>> num ;
   if (num<=0 ){
    cout<<"The number entered is negative"<<"\n";
    isPower = false;
   }else{
    if (!(num & (num-1))){
    isPower = false;
    }
    cout<<isPower<<"\n";
   }
return 0;
}