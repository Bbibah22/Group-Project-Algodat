public class Main {
    public static LinkedList createFixedList() {
        LinkedList list = new LinkedList();
        int[] Data = {25, 40, 80, 20, 45, 1, 99, 10, 75, 30, 62, 50, 55, 60, 90}; 
        
        for (int data : Data) {
            list.add(data);
        }
        return list;
    }
    
    // Metode untuk mengkloning list
    public static LinkedList cloneList(LinkedList original) {
        LinkedList newList = new LinkedList();
        Node current = original.head;
        while (current != null) {
            newList.add(current.data);
            current = current.next;
        }
        newList.count = original.count;
        return newList;
    }
    
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("  BUBBLE SORT vs INSERTION SORT COMPARISON");
        System.out.println("================================================");
        
        // 1. Buat Linked List awal dengan data yang sudah ditentukan
        LinkedList originalList = createFixedList();
        
        // 2. Clone List untuk Bubble Sort dan Insertion Sort
        LinkedList bubbleList = cloneList(originalList);
        LinkedList insertionList = cloneList(originalList);
        
        System.out.print("Data Awal (" + originalList.count + " elemen): ");
        originalList.display();

        BubbleSort bubbleSorter = new BubbleSort(bubbleList);
        System.out.println("\n[Bubble Sort]");
        
        long startTimeBubble = System.nanoTime();
        bubbleSorter.sort();
        long endTimeBubble = System.nanoTime();
        
        System.out.print("Hasil Sort: ");
        bubbleSorter.display();
        System.out.println("Waktu Eksekusi: " + (endTimeBubble - startTimeBubble) + " nanodetik");
        
        InsertionSort insertionSorter = new InsertionSort(insertionList);
        System.out.println("\n[Insertion Sort]");
        
        long startTimeInsertion = System.nanoTime();
        insertionSorter.sort();
        long endTimeInsertion = System.nanoTime();
        
        System.out.print("Hasil Sort: ");
        insertionSorter.display();
        System.out.println("Waktu Eksekusi: " + (endTimeInsertion - startTimeInsertion) + " nanodetik");
    }
}