class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIdx=-1,maxIdx=-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
        }
        int del=Integer.MAX_VALUE;
        if(minIdx<maxIdx){
            del=Math.min(del,maxIdx+1);
            del=Math.min(del,n-minIdx);
            del=Math.min(del,minIdx+1+(n-maxIdx));
        }else{
            del=Math.min(del,minIdx+1);
            del=Math.min(del,n-maxIdx);
            del=Math.min(del,maxIdx+1+(n-minIdx));
        }
        return del;
    }
}