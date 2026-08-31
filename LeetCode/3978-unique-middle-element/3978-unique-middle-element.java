class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=nums[n/2];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==mid) cnt++;
        }
        return cnt==1;
    }
}