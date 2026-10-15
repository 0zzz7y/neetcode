class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = unique.add(nums[i]);
            if (!isUnique) {
                return true;
            }
        }
        return false;
    }
}