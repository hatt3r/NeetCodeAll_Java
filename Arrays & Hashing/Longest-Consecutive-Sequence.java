class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> numset = new HashSet<>();
        for(int num:nums) numset.add(num);
        int longest =1;
        for (int n:nums)
        {
            if(!numset.contains(n-1))
            {
                int count =1;
                while(numset.contains(n+ 1))
                {
                    n++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
            if(longest>nums.length/2) break;
        }
        return longest;
    }
}