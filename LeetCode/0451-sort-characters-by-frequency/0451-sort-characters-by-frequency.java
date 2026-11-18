class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray())
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        //To sort HashMap values -> Convert it to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            int val = e.getValue();
            while (val > 0) {
                sb.append(e.getKey());
                val--;
            }
        }
        return sb.toString();
    }
}