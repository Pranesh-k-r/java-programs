class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }

    
}
public class circularlist {
    Node head;

    public Node createNode(int data)
    {
        Node newNode = new Node(data);
        if(newNode != null)
        {
            newNode.data = data;
            newNode.next = newNode;
        }

        return newNode;

    }
    public void insertfront(int data){
        Node newNode= createNode(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }
        else{
            Node last=head;
            while (last.next!=head) {
                last=last.next;
                
            }
            newNode.next=head;
            head=newNode;
            last.next=head;
        }
    }
    public void printlist(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node current=head;
        do{
            System.out.println(current.data+"");
            current=current.next;
        }while(current!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        circularlist cr=new circularlist();
        cr.insertfront(2);
        cr.insertfront(5);
        cr.insertfront(7);
        cr.printlist();
    }
    
}
