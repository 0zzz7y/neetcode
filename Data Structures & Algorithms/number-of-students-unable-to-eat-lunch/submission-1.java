class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int student : students) queue.offer(student);

        int skipped = 0;
        int currSandwichStackTop = 0;
        while (!queue.isEmpty() && skipped < queue.size()) {
            int student = queue.poll();
            if (student != sandwiches[currSandwichStackTop]) {
                skipped++;
                queue.offer(student);
            } else {
                currSandwichStackTop++;
                skipped = 0;
            }
        }

        return queue.size();
    }
}