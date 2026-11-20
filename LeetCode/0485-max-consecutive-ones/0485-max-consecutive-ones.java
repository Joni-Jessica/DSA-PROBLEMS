class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int len=0,maxLen=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                len++;
                maxLen=Math.max(len,maxLen);
            }else{
                len=0;
            }
        }
        return maxLen;
    }
}