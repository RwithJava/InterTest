public class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];  // Initialize to the first element
        int maxSoFar = nums[0];       // Initialize global max to the first element
        int start = 0, end = 0, tempStart = 0;  // Variables to track the subarray indices

        for (int i = 1; i < nums.length; i++) {
            // If adding the current element to the subarray makes it worse, start a new subarray
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                tempStart = i;  // Starting a new subarray from current index
            } else {
                maxEndingHere += nums[i];
            }

            // If the current subarray is the largest we've seen, update the global max and indices
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;  // Set the start to where the current subarray began
                end = i;  // The end of the current subarray is the current index
            }
        }

        // Print the subarray with the largest sum
        System.out.print("Subarray with the largest sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();  // For clean output

        return maxSoFar;  // Return the largest sum
    }
}
