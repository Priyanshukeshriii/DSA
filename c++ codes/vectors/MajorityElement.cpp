#include<iostream>
#include<vector>
using namespace std;
int main() {
    vector <int> vec  = {1,2,1,3,1,4,1,5,1,1};
    // for(int num : vec){
    //     int count = 1;
    //     for(int i = 1 ;i<vec.size() ; i++){
    //         if(num == vec[i]){
    //             count++;
    //         }
    //     }
    //     if (count >= (vec.size()/2 + 1)){
    //         cout<<num<<"\n";
    //         break;
    //     }
    // }
    int candidate = vec[0] ,count = 1;
      for (int i = 1; i < vec.size(); i++) {  // O(n)
        if (count == 0) {
            candidate = vec[i];
            count = 1;
        } else if (vec[i] == candidate) {
            count++;
        } else {
            count--;
        }
    }
    cout<<candidate<<"\n";
return 0;
}