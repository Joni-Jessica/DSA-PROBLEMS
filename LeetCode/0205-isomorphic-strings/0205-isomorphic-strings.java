class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i),b=t.charAt(i);
            if(hm1.containsKey(a)){
                char val=hm1.get(a);
                if(val!=b) return false;
            }else{
                hm1.put(a,b);
            }
        }
        HashMap<Character,Character> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=t.charAt(i),b=s.charAt(i);
            if(hm2.containsKey(a)){
                char val=hm2.get(a);
                if(val!=b) return false;
            }else{
                hm2.put(a,b);
            }
        }
        return true;
    }
}