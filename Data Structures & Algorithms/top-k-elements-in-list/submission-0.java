class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap
                .keySet()
                .stream()
                .sorted((a, b) -> countMap.get(b) - countMap.get(a))
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
