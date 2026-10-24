class MinStack {

    private static final int MAX_INITIAL_CAPACITY = 20;

    int[] values;

    int currIndex;

    public MinStack() {
        values = new int[MAX_INITIAL_CAPACITY];
        currIndex = -1;
    }

    public void push(int val) {
        currIndex++;
        if (currIndex == values.length) {
            resize();
        }
        values[currIndex] = val;
    }

    public void pop() {
        currIndex--;
    }

    public int top() {
        return values[currIndex];
    }

    public int getMin() {
        int min = values[currIndex];
        for (int i = currIndex - 1; i >= 0; i--) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    private void resize() {
        values = Arrays.copyOf(values, values.length * 2);
    }
}
