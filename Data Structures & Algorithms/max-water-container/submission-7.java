class Solution {
    public int maxArea(int[] heights) {
        int s = 0, t = heights.length - 1;
        int res = 0;

        while (s < t) {
            int l = heights[s];
            int r = heights[t];
            int cur = (t - s) * Math.min(l, r);
            res = Math.max(res, cur);

            if (l < r) {
                s++;
                l = heights[s];
                cur = (t - s) * Math.min(l, r);
                res = Math.max(res, cur);
            } else if (l > r) {
                t--;
                r = heights[t];
                cur = (t - s) * Math.min(l, r);
                res = Math.max(res, cur);
            } else {
                s++;
                t--;
            }
        }

        return res;
    }
}
