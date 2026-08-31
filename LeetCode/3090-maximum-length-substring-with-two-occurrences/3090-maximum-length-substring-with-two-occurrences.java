class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int maxCnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=i;j<n;j++){
                cnt++;
                char ch=s.charAt(j);
                if(hm.containsKey(ch)){
                    if(hm.get(ch)==2){
                        hm.clear();break;
                    }
                    else hm.put(ch,hm.get(ch)+1);
                }else{
                    hm.put(ch,1);
                }
                maxCnt=Math.max(cnt,maxCnt);
            }
        }
        return maxCnt;
    }
}