    public static  Node insert(Node head,int data) {
        //Complete this method
        Node list = new Node(data);
        if(head == null){
            head = list;
        }
        else{
            Node start = head;
            while(start.next != null){
                start = start.next;
            }
            start.next = list;
        }
        return head;
    }

