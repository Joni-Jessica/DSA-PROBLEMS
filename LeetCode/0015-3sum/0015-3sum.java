class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int p1=i+1,p2=n-1;
            List<Integer> list=new ArrayList<>();
            while(p1<p2){
                int sum=nums[p1]+nums[p2]+nums[i];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    p1++;
                    p2--;
                    while(p1<p2 && nums[p1]==nums[p1-1]) p1++;
                    while(p1<p2 && nums[p2]==nums[p2+1]) p2--;
                }else if(sum<0){
                    p1++;
                }else p2--;
            }
            //if(list.size()!=0) res.add(list);
        }
        return res;
    }
}