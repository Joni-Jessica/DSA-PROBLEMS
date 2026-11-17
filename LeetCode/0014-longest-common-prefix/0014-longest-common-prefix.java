class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String a=strs[0],b=strs[n-1];
        int p1=0,p2=Math.min(a.length(),b.length());
        while(p1<p2){
            if(a.charAt(p1)==b.charAt(p1)) p1++;
            else break;
        }
        return (a.length()<b.length())?a.substring(0,p1):b.substring(0,p1);
    }
}