public class CLL {

    Node head;
    Node tail;

    public  static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.data + "->");
                temp = temp.next;
            }while(temp != head);
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();
    }
}
