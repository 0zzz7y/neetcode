class Solution {

    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        var res1 = cache.get(n - 1);
        if (res1 == null) {
            res1 = climbStairs(n - 1);
            cache.put(n - 1, res1);
        }
        var res2 = cache.get(n - 2);
        if (res2 == null) {
            res2 = climbStairs(n - 2);
            cache.put(n - 2, res2);
        }
        return res1 + res2;
    }
}
