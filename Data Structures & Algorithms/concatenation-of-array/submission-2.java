class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length*2];
        int k = arr.length/2;;
        System.arraycopy(nums, 0, arr, 0, nums.length);
        for(int i = 0; i < nums.length; i++)
        {
            arr[k] = nums[i];
            k++;
        }
        return arr;
    }
}