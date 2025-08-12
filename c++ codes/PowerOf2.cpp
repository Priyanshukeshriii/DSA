#include<iostream>
using namespace std;
int main() {
    bool isPower =true;
    int num;
    cout<<"enter the number:";
    cin>>num;


if (num<=0){
    cout<<"the entered is negative: which is invalid"<<"\n";
    isPower = false;
}else{   while (num>1)
    {
    if (num % 2 == 0 ){
        num/=2;
    }else {
        isPower =false;
        break;
    }
    }}
    cout<<isPower<<"\n";

return 0;
}