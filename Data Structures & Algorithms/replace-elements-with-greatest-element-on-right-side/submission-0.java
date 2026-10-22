class Solution {
    public int[] replaceElements(int[] arr) {
        int currGreatestElement = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                currGreatestElement = arr[i];
                arr[i] = -1;
            } else if (arr[i] > currGreatestElement) {
                int olderGreatestElement = currGreatestElement;
                currGreatestElement = arr[i];
                arr[i] = olderGreatestElement;
            } else {
                arr[i] = currGreatestElement;
            }
        }
        return arr;
    }
}