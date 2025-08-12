#include<iostream>
using namespace std;
int main() {
    int a = 3 ;
    int b =40;
    int *ptr = &a;
    int *ptr1 = &b;
    cout<<ptr<<"\n";
    cout<<ptr1<<"\n";
    cout<<ptr - ptr1<<"\n";
return 0;
}