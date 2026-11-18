class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] letters=new int[26];
        for(char c:s.toCharArray()){
            int idx=c-'a';
            letters[idx]+=1;
        }
        //for(int num:letters) System.out.print(num+" ");
        for(char c:t.toCharArray()){
            int idx=c-'a';
            if(letters[idx]==0) return false;
            else letters[idx]-=1;
        }
        return true;
    }
}