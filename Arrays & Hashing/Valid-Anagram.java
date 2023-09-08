class Solution {
    public boolean isAnagram(String s, String t) {

        char[] schr =  s.toCharArray();
        char[] tchr = t.toCharArray();
        if(schr.length != tchr.length)
        {
            return false;
        }
        Arrays.sort(schr);
        Arrays.sort(tchr);
        for(int i =0; i<schr.length;i++)
        {
            if(schr[i]!=tchr[i])
            {
                return false;
            }

        }
        return true;
    }
}