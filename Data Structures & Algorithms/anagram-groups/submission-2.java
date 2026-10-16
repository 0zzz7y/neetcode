class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Character>, List<String>> anagrams = new HashMap<List<Character>, List<String>>();
        for (String str : strs) {
            List<Character> chars = str.chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList());
            if (!anagrams.keySet().contains(chars)) {
                var list = new ArrayList<String>();
                list.add(str);
                anagrams.put(chars, list);
            } else {
                var list = anagrams.get(chars);
                if (list != null)
                    list.add(str);
            }
        }
        return new ArrayList<>(anagrams.values());
    }
}
