class Solution {
    public long countCommas(long n) {
        long result = 0;
        if (n >= 1000) { // 4–6 digits → 1 comma each
            result += (Math.min(n, 999_999) - 999) * 1;
        }
        if (n >= 1_000_000) { // 7–9 digits → 2 commas each
            result += (Math.min(n, 999_999_999) - 999_999) * 2;
        }
        if (n >= 1_000_000_000L) { // 10–12 digits → 3 commas each
            result += (Math.min(n, 999_999_999_999L) - 999_999_999) * 3;
        }
        if (n >= 1_000_000_000_000L) { // 13–15 digits → 4 commas each
            result += (Math.min(n, 999_999_999_999_999L) - 999_999_999_999L) * 4;
        }
        if (n >= 1_000_000_000_000_000L) { // If n itself is >= 1e15, add its commas explicitly
            result += 5;
        }
        return result;
    }
}