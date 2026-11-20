class Solution {
    public void reverse(int[] nums, int p1, int p2) {
        while (p1 < p2) {
            int temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
}