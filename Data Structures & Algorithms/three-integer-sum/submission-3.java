class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        // -4 -1 -1 0 1 2

        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1])
                continue;
            Map<Integer, Integer> map = new HashMap<>();
            int target = -nums[i];
            int j = i + 1;

            // 0 0 0 0
            while (j < nums.length) {
                int cur = nums[j];
                if (map.containsKey(target - cur)) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(target - cur);
                    temp.add(cur);
                    res.add(temp);
                    while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                        j++;
                    };
                }
                map.put(cur, cur);
                j++;
            }
        }
        return res;
    }
}
