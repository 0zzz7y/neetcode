class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnesFound = 0;
        int currConsecutiveOnesStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currConsecutiveOnesStreak++;
                if (currConsecutiveOnesStreak > maxConsecutiveOnesFound) {
                    maxConsecutiveOnesFound = currConsecutiveOnesStreak;
                }
            } else {
                currConsecutiveOnesStreak = 0;
            }
        }
        return maxConsecutiveOnesFound;
    }
}