class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }

        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i] - 1)) {
                int cur = 1;
                int j = nums[i];
                while (map.containsKey(j + 1)) {
                    cur += 1;
                    j += 1;
                }
                if (cur > res) {
                    res = cur;
                }
            }
        }

        return res;
    }
}
