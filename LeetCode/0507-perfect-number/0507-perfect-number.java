class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans=0;
        if(num==1) return false;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                ans+=i;
                if(num/i!=num) ans+=num/i;
            }
        }
        return ans==num;
    }
}