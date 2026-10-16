class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                return true;
            }
            result.add(nums[i]);
        }
        return false;
    }
}