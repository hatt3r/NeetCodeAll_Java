class Solution {
    public int minSwaps(String s) {
        int maxClose =0;
        int close = 0;
        for (int i =0;i<s.length();i++)
        {
            if(s.charAt(i)==']')
            {
                close ++;
                maxClose = Math.max(close,maxClose);
            }
            else
            {
                close --;
            }
        }
        return (maxClose+1)/2;
    }
}