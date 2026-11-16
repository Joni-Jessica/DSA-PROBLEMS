class Solution {
    public String solve(String s,int k,StringBuilder op){
        if(s.length()<=k) return s;
        int sum=0,cnt=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
            cnt++;
            if(cnt==k){
                op.append(sum);
                sum=0;
                cnt=0;
            }
        }
        if(cnt!=0) op.append(sum);
        return solve(op.toString(),k,new StringBuilder());
    }
    public String digitSum(String s, int k) {
        if(s.length()<=k) return s;
        StringBuilder op=new StringBuilder();
        String ans=solve(s,k,op);
        return ans;
    }
}