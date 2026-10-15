class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = result.add(nums[i]);
            if (!isUnique) {
                return true;
            }
        }
        return false;
    }
}