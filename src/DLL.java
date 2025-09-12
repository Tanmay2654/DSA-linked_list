public class DLL {

    public Node head;

    public  static class Node{
        int data;
        Node next ;
        Node prev ;

        Node(int data){
            this.data = data;
        }
    }

    public void addfirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        newnode.prev = null;
        if(head!= null){
            head.prev = newnode;
        }
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        //we are doing this without tail at last , we only use head and a temp variable here for practice
        Node temp = head;
        if(head == null){
            head = newnode;
        }
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = null;
    }

    //this part is for inserting at particular node
    public Node find(int data){
        Node temp = head;
        while(temp!= null){
            if(temp.data == data){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addatplace(int after , int data){
        Node p = find(after);
        if(p==null){
            System.out.print("Node doesnt exist");
            return;
        }

        Node newnode = new Node(data);
        newnode.next = p.next;
        p.next = newnode;
        newnode.prev = p;
        if(newnode.next!=null){
            newnode.next.prev = newnode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayrev(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.data + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("list in reverse order");
        while(last!=null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addlast(9);

        list.addatplace(4 , 16);

        list.display();
        list.displayrev();
    }
}
