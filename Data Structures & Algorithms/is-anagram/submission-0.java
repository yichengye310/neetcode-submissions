class Solution {
    public boolean isAnagram(String s, String t) {
        int[] rec = new int[26];
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            rec[ss - 'a']++;
            rec[tt - 'a']--;
        }
        for (int c : rec) {
            if (c != 0) return false;
        }
        return true;
    }
}
