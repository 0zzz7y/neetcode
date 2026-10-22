class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size * 2];
        for (int i = 0; i < size; i++) {
            ans[i] = nums[i];
            ans[i + size] = nums[i];
        }
        return ans;
    }
}