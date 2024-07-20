class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int middle = nums[(nums.length)/2];
        int count = 0;

        for(int el: nums) {
            count += Math.abs(el-middle);
        }
        return count;
    }
}