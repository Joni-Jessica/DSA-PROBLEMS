class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefixMax=new int[n];
        int[] suffixMin=new int[n];
        prefixMax[0]=nums[0];
        suffixMin[n-1]=nums[n-1];
        //System.out.print(su)
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffixMin[i]=Math.min(suffixMin[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            //System.out.println(prefixMax[i]+" "+suffixMin[i]);
            int diff=prefixMax[i]-suffixMin[i];
            if(diff<=k) return i;
        }
        return -1;
    }
}