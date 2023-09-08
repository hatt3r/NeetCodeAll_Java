class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int rightmax = -1;
        for(int i =len-1;i>-1;i--)
        {
            int newmax = Math.max(rightmax,arr[i]);
            arr[i]=rightmax;
            rightmax=newmax;

        }
        return arr;
    }
}