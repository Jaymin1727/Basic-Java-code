class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}
class LinkList{
    Node head;

    public void InsertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void InsertAtEnd(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertAtPosition(int position, int data) {

        if (position == 1) {
            InsertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ===========================
    // Delete First Node
    // ===========================
    public void deleteBeginning() {

        if (head == null) {
            return;
        }

        head = head.next;
    }

    // ===========================
    // Delete Last Node
    // ===========================
    public void deleteEnd() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // ===========================
    // Delete by Position
    // ===========================
    public void deletePosition(int position) {

        if (head == null)
            return;

        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // ===========================
    // Search Element
    // ===========================
    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    // ===========================
    // Reverse Linked List
    // ===========================
    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        head = prev;
    }

    // ===========================
    // Count Nodes
    // ===========================
    public int countNodes() {

        int count = 0;

        Node temp = head;

        while (temp != null) {

            count++;

            temp = temp.next;
        }

        return count;
    }

    // ===========================
    // Find Middle Node
    // ===========================
    public void middleNode() {

        if (head == null)
            return;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Node : " + slow.data);
    }

    public void displayLinkList(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}

public class LinkListMain{

    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtBeginning(5);

        System.out.println("Original List");
        list.displayLinkList();
         list.insertAtPosition(3, 15);

        System.out.println("\nAfter Insert Position");
        list.displayLinkList();

        // Delete Beginning
        list.deleteBeginning();

        System.out.println("\nAfter Delete Beginning");
        list.displayLinkList();

        // Delete End
        list.deleteEnd();

        System.out.println("\nAfter Delete End");
        list.displayLinkList();

        // Delete Position
        list.deletePosition(2);

        System.out.println("\nAfter Delete Position");
        list.displayLinkList();

        // Search
        System.out.println("\nSearch 20 : " + list.search(20));

        // Count Nodes
        System.out.println("Total Nodes : " + list.countNodes());

        // Middle Node
        list.middleNode();

        // Reverse
        list.reverse();

        System.out.println("\nAfter Reverse");
        list.displayLinkList();
    }

}