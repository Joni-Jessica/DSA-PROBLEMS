class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> list:knowledge){
            hm.put(list.get(0),list.get(1));
        }
        boolean found=false;
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='(') found=true;
            else if(c==')'){
                String temp=sb.toString();
                if(hm.containsKey(temp)){
                    res.append(hm.get(temp));
                }else{
                    res.append("?");
                }
                found=false;
                sb=new StringBuilder();
            }else if(found){
                sb.append(c);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}