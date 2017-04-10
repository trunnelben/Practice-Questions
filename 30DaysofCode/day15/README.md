Objective 
Today we're working with Linked Lists. Check out the Tutorial tab for learning materials and an instructional video!

A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, , pointing to the first node of a linked list, and an integer  value that must be added to the end of the list as a new Node object.

Task 
Complete the insert function in your editor so that it creates a new Node (pass  as the Node constructor argument) and inserts it at the tail of the linked list referenced by the  parameter. Once the new node is added, return the reference to the  node.

Note: If the  argument passed to the insert function is null, then the initial list is empty.