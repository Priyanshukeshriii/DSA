#include<iostream>
using namespace std;
int main() {
    int a = 10;
    int* ptr =  &a;
    cout<<ptr<<"\n";
    ptr++;
    cout<<ptr<<"\n";
    cout<<*ptr<<"\n";
    int arr[] = {1, 2, 3, 4,5};
    cout<<*arr<<"\n";
    cout<<*(arr+1)<<"\n";
    cout<<*(arr+2)<<"\n";
    cout<<*(arr+3)<<"\n";
    cout<<*(arr+4)<<"\n";
return 0;
}