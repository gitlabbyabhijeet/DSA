package linkedlist;

public class list {

    public static class Node{
        int data;
        Node next;  //It stores address of next node 

        //constructor
        public Node(int data){
            this.data = data;
        }
    }
    

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        //Insert-Method At the End

        public void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        //Insert-Method At the Start

        public void insertAtBeg(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
            }
            head = temp;
        }

        
        //Display Method 
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
        }
    }


    public static void main(String args[]){
        // Node a = new Node(2);
        // Node b = new Node(4);
        // Node c = new Node(6);
        // Node d = new Node(8);
        // Node e = new Node(10);

        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;

        // // System.out.print(a.data);
        // // System.out.print(b.data);
        // // System.out.print(c.data);
        // // System.out.print(d.data);
        // // System.out.print(e.data);

        // display(a);
        // dis(a);
        // int len = length(a);
        // System.out.println();
        // System.out.println("Length of linkedlist is "+ len);
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.insertAtBeg(1);
        ll.display();
    }
    
}
