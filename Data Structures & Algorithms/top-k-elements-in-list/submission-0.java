class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<int[]> arr = new ArrayList<>();
        for (Integer i : map.keySet()) {
            int count = map.get(i);
            arr.add(new int[]{i, count});
        }
        arr.sort((a,b) -> b[1] - a[1]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[0];
        }
        return res;
    }
}
