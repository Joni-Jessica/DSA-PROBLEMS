class Solution {
    public int maxDepth(String s) {
        int cnt=0,res=Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            if(c=='('){
                cnt++;
            }else if(c==')'){
                cnt--;
            }
            res=Math.max(res,cnt);
        }
        return res;
    }
}