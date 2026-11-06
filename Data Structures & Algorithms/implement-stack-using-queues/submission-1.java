class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        int i = 1;
        queue.offer(x);
        while (i < queue.size()) {
            queue.offer(queue.poll());
            i++;
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.size() == 0;
    }
}
