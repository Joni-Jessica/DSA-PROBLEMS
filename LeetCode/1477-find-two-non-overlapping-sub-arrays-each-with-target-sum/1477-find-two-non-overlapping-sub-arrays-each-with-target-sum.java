class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE;

        // Step 1: sliding window to find all subarrays with sum = target
        int[] best = new int[n]; // best[i] = shortest subarray ending at or before i
        Arrays.fill(best, INF);

        int sum = 0, left = 0;
        int ans = INF;
        int minLen = INF;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // shrink window
            while (sum > target && left <= right) {
                sum -= arr[left++];
            }

            // found a subarray
            if (sum == target) {
                int currLen = right - left + 1;
                // combine with best subarray ending before left
                if (left > 0 && best[left - 1] != INF) {
                    ans = Math.min(ans, currLen + best[left - 1]);
                }
                minLen = Math.min(minLen, currLen);
            }

            // update best up to right
            best[right] = minLen;
        }

        return ans == INF ? -1 : ans;
    }
}
