class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> brackets = new ArrayDeque<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(', '[', '{' -> {
                    brackets.push(chars[i]);
                }
                case ')'-> {
                    if (brackets.peek() == null || brackets.pop() != '(') {
                        return false;
                    }
                }
                case ']'-> {
                    if (brackets.peek() == null || brackets.pop() != '[') {
                        return false;
                    }
                }
                case '}'-> {
                    if (brackets.peek() == null || brackets.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return brackets.isEmpty();
    }
}
