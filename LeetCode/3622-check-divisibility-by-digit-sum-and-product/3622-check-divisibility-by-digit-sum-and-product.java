class Solution {
    public boolean checkDivisibility(int n) {
        long sum=0,prod=1;
        int x=n;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            prod*=digit;
            x/=10;
        }
        long ans=sum+prod;
        if((n%ans)==0) return true;
        return false;
    }
}