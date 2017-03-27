/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node spot = head;
    HashSet visit = new HashSet<Node>();
    while(!visit.contains(spot)){
        if(spot == null){
            return false;
        }
        visit.add(spot);
        spot = spot.next;
    }
    return true;
}
