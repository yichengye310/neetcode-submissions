class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] rec = getFreq(str);
            String key = Arrays.toString(rec);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    // O(n)
    private int[] getFreq(String s) {
        int[] rec = new int[26];
        if (s == null) return rec;
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            rec[ss - 'a']++;
        }
        return rec;
    }
}
