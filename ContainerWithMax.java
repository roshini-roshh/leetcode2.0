class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxw=0;
        while(left<right)
        {
            int width=right-left;
            int cHeight=Math.min(height[left],height[right]);
            int currwater=width*cHeight;
            if(currwater>maxw){
                maxw=currwater;
            }
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
        }
        return maxw;

        
    }
    }
