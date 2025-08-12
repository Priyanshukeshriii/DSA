#include<iostream>
using namespace std;


int dec_to_bin(int num){
    int bin= 0;
    int pow = 1;
    while (num>0)
    {
        int rem = num % 2;
        num = num/2;
        bin += rem * pow;
        pow *= 10;
    }
    return bin;
} 




int main() {
cout<<dec_to_bin(10)<<"\n";
return 0;
}