class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, i);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
