class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs)
        {
            char[] chrs = s.toCharArray();
            Arrays.sort(chrs);
            String sortedword = new String(chrs);
            if(!map.containsKey(sortedword))
            {map.put(sortedword, new ArrayList<>());}
            map.get(sortedword).add(s);
        }
        return new ArrayList<>(map.values());
    }
}