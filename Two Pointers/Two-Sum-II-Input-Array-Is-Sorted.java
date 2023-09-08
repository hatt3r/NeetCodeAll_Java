class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int num_a,num_b;
        while(i<j)
        {
            num_a = numbers[i];
            num_b = numbers[j];
            if(num_a+num_b==target) break;
            if(num_a + num_b<target)
            {
                i++;
                continue;
            }
            j--;
        }
        return new int[] {i+1,j+1};
    }
}