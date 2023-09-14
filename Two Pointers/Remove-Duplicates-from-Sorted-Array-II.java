class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;

        int l=0,r=0;
        while(l<nums.length)
        {
            nums[r++]=nums[l++];
            if(l<nums.length && nums[l]==nums[r-1])
            {
                nums[r++]=nums[l++];
            }
            while(l<nums.length && nums[l]==nums[r-1])
            {l++;}
        }

        return r;
    }
}