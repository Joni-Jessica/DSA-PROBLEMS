class Solution {
    public void sortColors(int[] nums) {
        //Arrays.sort(nums);
        int n=nums.length;
        int[] cnt=new int[3];
        for(int i:nums) cnt[i]++;
        int idx=0;
        for(int i=0;i<3;i++){
            int val=cnt[i];
            while(val>0){
                nums[idx++]=i;
                val--;
            }
        }
    }
}