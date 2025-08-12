#include<iostream>
#include<vector>
using namespace std;
int main() {
   vector<int> vec ;
   vec.push_back(23);
   vec.push_back(2);
   vec.push_back(3);
   cout<<vec.size()<<"\n";
   cout<<vec.capacity()<<"\n";//each time the capacity is being double the current vector is out of the capacity
   vec.push_back(3);
   vec.push_back(4);
   cout<<vec.size()<<"\n";
   cout<<vec.capacity()<<"\n";
return 0;
}