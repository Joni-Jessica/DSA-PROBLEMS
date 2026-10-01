class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[p1]) {
                p1++;
                nums[p1] = nums[i];
            }
        }
        return p1 + 1;
    }
}