class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {return validPalinFunc(s,i+1,j) || validPalinFunc(s,i,j-1);}
        }
        return true;
    }
    private boolean validPalinFunc(String s, int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {return false;}
        }
        return true;
    }
}