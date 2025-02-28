class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }

    static void traverse(Node Head) {
        Node curr = Head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    void insert(Node Head, int pos, int data) {
        Node n4 = new Node(data);

        if (pos == 0) {
            n4.next = Head;
            Head = n4;
            traverse(Head);
            return;
        }

        Node prev = Head;

        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        n4.next = prev.next;
        prev.next = n4;
        traverse(Head);
    }

    void delete(Node Head, int pos) {
        if (pos == 0) {
            Head = Head.next;
            traverse(Head);
            return;
        }
        Node prev = Head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        traverse(Head);
    }

    void update(Node Head, int pos, int data) {
        if (pos == 0) {
            Head.data = data;
            traverse(Head);
            return;
        }
        Node prev = Head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next.data = data;
        traverse(Head);
    }

    
}

public class App {
    public static void main(String[] args) throws Exception {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node Head = n1;

        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        // n1.insert(Head, 2, 40);
        //n1.delete(Head, 1);
        // n1.update(Head, 2,50);
        
    }
}
