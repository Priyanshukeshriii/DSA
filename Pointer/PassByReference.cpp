#include<iostream>
using namespace std;
void changeA(int* a){
    *a = 10;
}
int main() {
    int a = 20;
    cout<<a<<"\n";
    changeA(&a);
    cout<<a<<"\n";
return 0;
}