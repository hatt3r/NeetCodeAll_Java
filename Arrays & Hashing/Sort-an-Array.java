class Solution {
    public int[] sortArray(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int i:nums){
            if(i<min)
                min=i;
            if(i>max)
                max=i;
        }

        int size=max-min+1;
        int[] hash=new int[size];

        for(int i=0;i<nums.length;i++){
            hash[nums[i]-min]++;
        }

        int cnt=0;
        for(int i=0;i<hash.length;i++)
        {
            while(hash[i]>0){
                nums[cnt++]=(i+min);
                hash[i]--;
            }
        }
        return nums;
    }
}