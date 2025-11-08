public class LinkedList {
    Node head;
    int count;
    
    public LinkedList() {
        this.head = null;
        this.count = 0;
    }
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        count++;
    }
    
}
