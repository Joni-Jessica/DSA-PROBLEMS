class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cnt=0,maxCnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            cnt=0;
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<n;j++){
                //hs.add(s.charAt(j));
                if(!hs.contains(s.charAt(j))) cnt++;
                else break;
                hs.add(s.charAt(j));
            }
            maxCnt=Math.max(cnt,maxCnt);
        }
        return maxCnt;
    }
}