class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num :nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet())
        {
            if(map.get(key) > n/2)
            {
                return key;
            }
        }
        return -1;
    }
}