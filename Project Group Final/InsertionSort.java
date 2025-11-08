public class InsertionSort {
    LinkedList list;
    
    public InsertionSort(LinkedList list) {
        this.list = list;
    }
    
    public void sort() {
        if (list.head == null || list.head.next == null) {
            return;
        }
        
        Node sorted = null;
        Node current = list.head;
        
        while (current != null) {
            Node next = current.next;
            
            if (sorted == null || sorted.data >= current.data) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.next != null && temp.next.data < current.data) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = next;
        }
        
        list.head = sorted;
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