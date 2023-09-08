class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        int s1=0;
        int t1=0;
        while(s1<s.length() && t1<s.length())
        {   if ((smap.containsKey(s.charAt(s1)) && smap.get(s.charAt(s1)) != t.charAt(t1))||(tmap.containsKey(t.charAt(t1)) && tmap.get(t.charAt(t1)) != s.charAt(s1)))
        {   return false;
        }
            smap.put(s.charAt(s1),t.charAt(t1));
            tmap.put(t.charAt(t1),s.charAt(s1));s1++;t1++;
        }
        return true;
    }
}