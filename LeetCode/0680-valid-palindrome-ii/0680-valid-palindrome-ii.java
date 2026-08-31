class Solution {
    public boolean isPal(String s,int p1,int p2){
        while(p1<p2){
            if(s.charAt(p1)!=s.charAt(p2))
                return false;
            else{
                p1++;
                p2--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int p1=0,p2=n-1;
        //int cnt=1;
        while(p1<p2){
            if(s.charAt(p1)==s.charAt(p2)){
                p1++;
                p2--;
            }else{
                return (isPal(s,p1,p2-1)||isPal(s,p1+1,p2));
                //return true;
            }
        }
        return true;
    }
}