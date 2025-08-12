#include<iostream>
#include<vector>
using namespace std;
int main() {
   vector<int> vec ;//size =0 
   vec = {1,2,3,4};
   cout<<vec[0]<<"\n";
   vector<int> fill (3,1);
   cout<<fill[0]<<"\n";
   cout<<fill[1]<<"\n";
   cout<<fill[2]<<"\n";
return 0;
}