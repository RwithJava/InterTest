public class LinkedListMiddleFinder {
    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;  // Handle edge case of empty list
        }

        Node slow = head;
        Node fast = head;

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;  // Move slow pointer by 1 step
            fast = fast.next.next;  // Move fast pointer by 2 steps
        }

        // When fast pointer reaches the end, slow pointer is at the middle
        return slow;
    }
}
