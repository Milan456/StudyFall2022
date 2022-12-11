package Week5.mergeSort;

public class Driver {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertElement(4);
        list.insertElement(2);
        list.insertElement(1);
        list.insertElement(3);
        System.out.println("Unsorted");
        list.print();
        list.sortList();
        System.out.println("Sorted");
        list.print();
    }
}
