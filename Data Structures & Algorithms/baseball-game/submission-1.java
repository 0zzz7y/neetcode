class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<String> data = new ArrayDeque<String>();
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+" -> {
                    String xStr = data.pop();
                    int x = Integer.valueOf(xStr);
                    int y = Integer.parseInt(data.peek());
                    data.push(xStr);
                    int res = x + y;
                    data.push(String.valueOf(res));
                    result += res;
                }
                case "C" -> {
                    int num = Integer.parseInt(data.pop());
                    result -= num;
                }
                case "D" -> {
                    String xStr = data.peek();
                    int x = Integer.valueOf(xStr);
                    int res = x * 2;
                    data.push(String.valueOf(res));
                    result += res;
                }
                default -> {
                    int num = Integer.parseInt(operations[i]);
                    result += num;
                    data.push(operations[i]);
                }
            }
        }
        return result;
    }
}