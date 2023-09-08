class Solution {
    public String mergeAlternately(String str1, String str2) {
        StringBuilder merged = new StringBuilder();
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            merged.append(str1.charAt(i)).append(str2.charAt(i));
        }

        if (len1 > len2) {
            merged.append(str1.substring(minLen));
        } else {
            merged.append(str2.substring(minLen));
        }

        return merged.toString();
    }
}
