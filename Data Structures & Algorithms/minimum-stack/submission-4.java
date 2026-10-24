class MinStack {

    private static final int MAX_INITIAL_CAPACITY = 50;

    int[] values;

    int[] minimums;

    int currIndex;

    int currMinimumIndex;

    public MinStack() {
        values = new int[MAX_INITIAL_CAPACITY];
        minimums = new int[MAX_INITIAL_CAPACITY];
        minimums[0] = Integer.MIN_VALUE;
        currIndex = -1;
        currMinimumIndex = -1;
    }

    public void push(int val) {
        currIndex++;
        if (currIndex == values.length) {
            resize();
        }
        values[currIndex] = val;

        if (currMinimumIndex == -1) {
            currMinimumIndex++;
            minimums[currMinimumIndex] = val;
        } else if (val <= minimums[currMinimumIndex]) {
            currMinimumIndex++;
            if (currMinimumIndex == minimums.length) {
                resizeMinimums();
            }
            minimums[currMinimumIndex] = val;
        }
    }

    public void pop() {
        if (values[currIndex] == minimums[currMinimumIndex]) {
            currMinimumIndex--;
        }
        currIndex--;
    }

    public int top() {
        return values[currIndex];
    }

    public int getMin() {
        return minimums[currMinimumIndex];
    }

    private void resize() {
        values = Arrays.copyOf(values, values.length * 2);
    }

    private void resizeMinimums() {
        minimums = Arrays.copyOf(minimums, minimums.length * 2);
    }
}
