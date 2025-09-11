public class LL {

    public Node head;
    public Node tail;

    public class Node{
        Integer data;
        Node next ;

        Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(Integer data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    public void addlast(Integer data){
        Node newnode = new Node(data);
        if(tail == null){
            addfirst(data);
            return;
        }

        tail.next =  newnode ;
        tail = newnode;
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty");
        }

        head = head.next;
    }

    public void deletelast(){
        if(head == null){   // for 0 element in list
            System.out.println("List is empty");
        }

        if(head.next == null){    // for 1 element in list
            head = null;
            return ;
        }

        Node secondlast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondlast = secondlast.next;
        }

        secondlast.next = null;
    }

    public void deleteatindex(int index){
        if (index == 0){
            System.out.println("empty list");
        }

        Node prev = get(index-1);

        prev.next = prev.next.next;
    }

    public Node get(int index){
        Node node = head ;
        for(int i=0 ; i<index ; i++){
            node= node.next;
        }

        return node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(2);
        list.addfirst(4);
        list.addfirst(6);
        list.addfirst(8);
        list.addfirst(12);

        list.addlast(5);

        list.display();

        list.deletefirst();
        list.display();

        list.deletelast();
        list.display();

        list.deleteatindex(2);
        list.display();
    }
}
