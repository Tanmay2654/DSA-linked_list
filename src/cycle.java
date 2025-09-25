public class cycle {
    ListNode head;
    ListNode tail;

    public class ListNode {
        int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
      }
    }

    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow ){
                return true;
            }
        }

        return false;
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


    public static void main(String[] args) {
        cycle list = new cycle();

        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);

       boolean ans =  list.hasCycle(list.head);
        System.out.println(ans);
    }
}
