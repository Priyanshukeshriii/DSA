#include<iostream>
#include<vector>
using namespace std;
int main() {
   vector<int> vec = {1,2,3,4,5};
   cout<<vec.size()<<"\n";//5
   vec.push_back(25);
   cout<<vec.size()<<"\n";//6
   vec.pop_back();//25
   for(int i : vec){
    cout<<i<<"\n";
   }
   cout<<vec.front()<<"\n";
   cout<<vec.back()<<"\n";
   cout<<vec.at(2)<<"\n";
return 0;
}