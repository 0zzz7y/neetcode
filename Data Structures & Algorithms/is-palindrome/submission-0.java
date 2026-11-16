class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.trim().toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(chars[i])) {
                i++;
                continue;
            } else if (!Character.isLetterOrDigit(chars[j])) {
                j--;
                continue;
            }
            if (chars[i] == chars[j]) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
