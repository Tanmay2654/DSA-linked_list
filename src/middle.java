public class middle {

    ListNode head;
    ListNode tail;

    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middle(ListNode head){
        ListNode fast  = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void addfirst(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // display linked list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        middle list = new middle();

        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);


        list.display();

        ListNode mid = list.middle(list.head);
        System.out.println("Middle element is: " + mid.val);

    }
}
