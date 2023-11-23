import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class DemoMain {
    public static void main(String[] args) throws IOException {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new SinglyLinkedListItem(6);
        singlyLinkedList.head.next = new SinglyLinkedListItem(1);
        singlyLinkedList.head.next.next = new SinglyLinkedListItem(5);
        singlyLinkedList.head.next.next.next = new SinglyLinkedListItem(1);
        singlyLinkedList.head.next.next.next.next = new SinglyLinkedListItem(6);

        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
        singlyLinkedList1.head = new SinglyLinkedListItem(2);
        singlyLinkedList1.head.next = new SinglyLinkedListItem(2);
        singlyLinkedList1.head.next.next = new SinglyLinkedListItem(2);
        singlyLinkedList1.head.next.next.next = new SinglyLinkedListItem(5);
        singlyLinkedList1.head.next.next.next.next = new SinglyLinkedListItem(6);
        singlyLinkedList1.head.next.next.next.next.next = new SinglyLinkedListItem(5);

        System.out.println("Result : " + checkPalindrome(singlyLinkedList1));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        DisplaySinglyLinkedList.displayList(singlyLinkedList1.head, " ", bufferedWriter);
        bufferedWriter.flush();

        // Close the BufferedWriter to release resources
        bufferedWriter.close();

    }

    public static int checkPalindrome(SinglyLinkedList a) {
        if(a == null || a.head == null)
            return 1;
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListItem curr = a.head;
        while(curr!=null){
            stack.push(curr.itemData);
            curr = curr.next;
        }
        curr = a.head;
        while(curr!=null){
            if(curr.itemData != stack.pop())
                return 0;
            curr = curr.next;
        }
        return 1;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListItem head;
    public SinglyLinkedListItem tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertItem(int itemData) {
        SinglyLinkedListItem item = new SinglyLinkedListItem(itemData);
        if (this.head == null) {
            this.head = item;
        } else {
            this.tail.next = item;
        }
        this.tail = item;
    }
}


class SinglyLinkedListItem {
    public int itemData;
    public SinglyLinkedListItem next;

    public SinglyLinkedListItem(int itemData) {
        this.itemData = itemData;
        this.next = null;
    }
}

class DisplaySinglyLinkedList {
    public static void displayList(SinglyLinkedListItem item, String sep, BufferedWriter bufferedWriter) throws IOException, IOException {
        while (item != null) {
            bufferedWriter.write(String.valueOf(item.itemData));
            item = item.next;
            if (item != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}
