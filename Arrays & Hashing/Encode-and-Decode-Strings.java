public class Solution {
    public String encode(List<String> strs) {
        String encode = "";
        for(int i=0;i<strs.size();i++)
        {
            encode = encode + strs.get(i) + ":";
        }
        return encode;
    }
    public List<String> decode(String str) {
        List<String> decode = new ArrayList<String>(Arrays.asList(str.split(":")));
        return decode;
    }
}