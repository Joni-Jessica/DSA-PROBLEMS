class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        long ans=0;
        while(num>0){
            int temp=num%10;
            ans=(ans*10)+temp;
            if(ans>Integer.MAX_VALUE) return 0;
            num/=10;
        }
        if(x<0) ans=-ans;
        if(ans<Integer.MIN_VALUE) return 0;
        return (int)ans;
    }
}