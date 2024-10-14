//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Find the middle of the linked list
//        Node middle = LinkedListMiddleFinder.findMiddle(head);
//        System.out.println("The middle element is: " + middle.val);  // Should print 3
//
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println("Largest sum of contiguous subarray: " + KadaneAlgorithm.maxSubArray(nums));
//
//        int[] nums1 = {-2, 1, -3, 4, -1, -2, 1, -5, 4};
//        System.out.println(firstNonRepeating(nums1));
//    }
//
//    public static int firstNonRepeating(int[] arr) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        for (int num : arr) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        for (int num : arr) {
//            if (countMap.get(num) == 1) {
//                return num;
//            }
//        }
//        return -1;
//    }
//
//}