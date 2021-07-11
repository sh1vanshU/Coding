
class MoveLastElementToHeadLinkedList
{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void moveToFront(){

        // do something
        if(head==null &&  head.next!=null)
        {
            return ;

        }
        Node current=head;
        Node secondLast=null;
        while(current.next!=null){
            secondLast=current;
            current=current.next;
        }
        secondLast.next=null;
        current.next=head;
        head=current;
    }

    void printList(){
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;

    }
     /* Driver program to test above functions */
    public static void main(String args[])
    {
        MoveLastElementToHeadLinkedList llist = new MoveLastElementToHeadLinkedList();
        /* Constructed Linked List is 1->2->3->4->5->null */
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
          
        System.out.println("Linked List before moving last to front ");
        llist.printList();
          
        llist.moveToFront();
          
        System.out.println("Linked List after moving last to front ");
        llist.printList();
    }
} 