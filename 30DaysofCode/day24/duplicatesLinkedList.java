    public static Node removeDuplicates(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node begin = head;
        while(begin.next != null){
            if(begin.data == begin.next.data){
                begin.next = begin.next.next;
            }
            else{
                begin = begin.next;
            }
        }
        return head;
    }
