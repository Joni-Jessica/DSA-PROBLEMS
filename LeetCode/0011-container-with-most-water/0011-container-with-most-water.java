class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int p1=0,p2=n-1;
        int ans=0,max=0;
        while(p1<p2){
            if(height[p1]<height[p2]){
                ans=height[p1]*(p2-p1);
                p1++;
            }else{
                ans=height[p2]*(p2-p1);
                p2--;
            }
            max=Math.max(ans,max);
        }
        return max;
    }
}