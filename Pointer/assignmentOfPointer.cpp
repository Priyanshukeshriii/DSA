#include<iostream>
using namespace std;
int main() {
    int a = 30;
    int* ptr = &a;
    cout<<ptr<<"\n";
    int** ptr2 = &ptr;
    cout<<"this is the pointer of pointer "<<"\n";
    cout<<ptr2<<"\n";
return 0;
}
