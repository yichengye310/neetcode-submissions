class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 2) {
            return new int[]{nums[1], nums[0]};
        }
        int[] arr = new int[nums.length];
        arr[0] = 1;
        // pre 1 1 2 8
        // suf 48 24 6 1
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i-1] * nums[i-1];
        }
        int posfix = 1;
        for (int i = nums.length - 1; i >=0 ;i--) {
            arr[i] *= posfix;
            posfix *= nums[i];
        }
        return arr;
    }
}  
