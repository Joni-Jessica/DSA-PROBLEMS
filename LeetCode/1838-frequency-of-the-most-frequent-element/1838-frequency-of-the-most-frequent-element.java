class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0,ans=0;
        long total=0;
        for(int right=0;right<nums.length;right++){
            total+=nums[right]; //expand the window

            //Adding L for 1 satisfies all hidden cases, coz without it int*int compared with a long leads to overflow condition
            while(nums[right]*(right-left+1L)>total+k){ //Invalid checking condition
                total-=nums[left]; //shrink the window
                left++;
            }
            
            ans=Math.max(ans,right-left+1); //if valid update answer
        }
        return ans;
    }
}