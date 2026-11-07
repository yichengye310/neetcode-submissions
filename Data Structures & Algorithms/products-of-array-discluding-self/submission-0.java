class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] != 0) prod *= nums[i];
            else zeroCount += 1;
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            if (zeroCount == 0) {
                arr[i] = prod / nums[i];
            } else if (zeroCount == 1){
                if (nums[i] == 0) {
                    arr[i] = prod;
                } else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}  
