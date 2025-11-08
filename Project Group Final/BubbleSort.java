public class BubbleSort {
    LinkedList list;
    
    public BubbleSort(LinkedList list) {
        this.list = list;
    }
    
    public void sort() {
        if (list.head == null || list.head.next == null) {
            return;
        }
        
        int n = list.count;
        // Loop for Bubble Sort passes
        for (int i = 0; i < n - 1; i++) {
            Node current = list.head;
            Node prev = null;
            // Loop for comparisons in each pass
            for (int j = 0; j < n - 1 - i; j++) {
                Node next = current.next;
                if (current.data > next.data) {
                    // Swap nodes: current and next
                    if (prev == null) {
                        // Swap when current is the head
                        list.head = next;
                    } else {
                        // Swap for non-head nodes
                        prev.next = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    prev = next; 
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }
    }
    
    public void display() {
        Node current = list.head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}