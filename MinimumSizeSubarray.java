public class MinimumSizeSubarray {
    private static int findMinimumSizeSubarray(int[] nums, int s) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        // Outer loop denotes starting index
        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            boolean found = false;
            // Inner loop finds the ending index
            for (int j = i + 1; j < n; j++) {
                if (sum >= s) {
                    // Subarray found
                    int length = j - i;
                    ans = Math.min(ans, length);
                    found = true;
                    break;
                }
                // Add the current value to sum
                sum += nums[j];
            }
            if (!found) {
                // This handles the case of subarray from i to last
                if (sum >= s) {
                    int length = n - i;
                    ans = Math.min(ans, length);
                }
            }
        }
        
        // Subarray with required sum is not found
        if (ans == Integer.MAX_VALUE) {
            ans = 0;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = new int[] {2, 3, 1, 2, 4, 3};
        int sum = 7;
        
        int minSize = findMinimumSizeSubarray(nums, sum);
        System.out.println(minSize);
    }
}