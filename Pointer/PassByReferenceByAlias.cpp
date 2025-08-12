#include<iostream>
using namespace std;
void changeA(int &b){// Pass by Reference using Alias
    b = 20;
}
int main() {
    int a = 10 ;
    changeA(a);
    cout<<a<<"\n";
return 0;
}