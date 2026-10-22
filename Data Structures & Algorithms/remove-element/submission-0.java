class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                var swapped = false;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        swap(nums, i, j);
                        swapped = true;
                        break;
                    }
                }
                if (swapped) {
                    continue;
                }
            } else {
                k++;
            }
            i++;
        }
        return k;
    }
}