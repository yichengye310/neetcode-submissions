class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ss = s.charAt(i);
            char tt = s.charAt(j);
            if (!Character.isLetterOrDigit(ss)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(tt)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(ss) != Character.toLowerCase(tt)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
