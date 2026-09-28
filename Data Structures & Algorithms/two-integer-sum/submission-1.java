class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> anand=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            anand.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];
            if(anand.containsKey(diff)&& anand.get(diff)!=i)
            {
                return new int[]{i,anand.get(diff)};
            }
        }
        return new int[0];
    }
}
