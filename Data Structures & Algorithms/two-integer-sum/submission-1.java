class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int right = 0; right < nums.length; right++)
        {
            int temp = target - nums[right];
            if(map.containsKey(temp))
            {
                return new int[]{map.get(temp), right};
            }
            map.put(nums[right], right);
        }
        return new int[]{-1, -1};
    }
}
