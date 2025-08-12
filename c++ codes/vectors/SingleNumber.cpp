#include<iostream>
#include<vector>
using namespace std;
int main() {
   vector<int> vec = {1,2,2,3,1};
   int ans = 0;
   for(int num : vec) {
    ans^= num;
   }
   cout<<ans<<"\n";
return 0;
}