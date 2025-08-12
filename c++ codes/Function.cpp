#include<iostream>
using namespace std;
int numbercalled = 0;//global variable

int sum(int a , int b){
    int sum = a+b;
    numbercalled++;
    return sum;
}
int get(){
    return numbercalled;
}


int main() {
cout<<sum(5,6)<<"\n";
cout<<sum(5,6)<<"\n";
cout<<sum(5,6)<<"\n";
cout<<sum(5,6)<<"\n";
cout<<get()<<"\n";
return 0;
}