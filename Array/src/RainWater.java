public class RainWater {
    class Solution {
        public int trap(int[] height) {
            int currentwater = 0;
            int maxwater = 0;
            int st = 0;
            int next = 1;
            int secst = 0;
            //taking the trapped water left to right
            while(next < height.length){
                if(height[st] > height[next]){
                    currentwater += (height[st] - height[next]);
                }else{
                    maxwater += currentwater;
                    currentwater = 0 ;
                    st = next;
                }
                next++;
            }
            //if the last block is not big Enough to hold water all the water then run the loop from back side
            if(currentwater != 0){
                currentwater = 0;
                int i = height.length -1;
                int end = height.length -2;
                while(end >= st){
                    if(height[i] > height[end]){
                        currentwater += (height[i] - height[end]);
                    }else{
                        maxwater += currentwater;
                        currentwater = 0 ;
                        i = end;
                    }
                    end--;
                }
            }


            return maxwater;
        }
    }

}
