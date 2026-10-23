class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> data = new ArrayDeque<Integer>();
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+" -> {
                    int x = data.pop();
                    int y = data.peek();
                    int opRes = x + y;
                    data.push(x);
                    data.push(opRes);
                    result += opRes;
                }
                case "C" -> {
                    result -= data.pop();
                }
                case "D" -> {
                    int x = data.peek();
                    int opRes = x * 2;
                    data.push(opRes);
                    result += opRes;
                }
                default -> {
                    int num = Integer.parseInt(operations[i]);
                    result += num;
                    data.push(num);
                }
            }
        }
        return result;
    }
}