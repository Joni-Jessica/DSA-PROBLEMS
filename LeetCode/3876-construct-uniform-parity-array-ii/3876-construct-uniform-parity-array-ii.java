class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int cntOdd=0,cntEven=0;
        int minO=Integer.MAX_VALUE,minVal=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                //minE=Math.min(minE,nums1[i]);
                cntEven++;
            }
            else{
                //minO=Math.min(minO,nums1[i]);
                cntOdd++;
            }
            minVal=Math.min(minVal,nums1[i]);
        }
        if(cntEven==n || cntOdd==n) return true;
        //System.out.println(cntOdd+" "+cntEven);
        for(int i=0;i<n;i++){
            if(minVal%2!=0){
                if(nums1[i]%2==0){
                    int diff=(nums1[i]-minVal);
                    if(diff<1 || diff%2==0){
                        //System.out.println("Hii");
                        return false;
                    }
                }
            }else{
                if(nums1[i]%2!=0){
                    int diff=(nums1[i]-minVal);
                    if(diff<1 || diff%2!=0){
                        //System.out.println("Hii");
                        return false;
                    }
                }
            }
        }
        return true;
    }
}