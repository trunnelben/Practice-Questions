	static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node removedNode = queue.poll();
            System.out.print(removedNode.data + " ");
            if(removedNode.left != null){
                queue.add(removedNode.left);
            }
            if(removedNode.right != null){
                queue.add(removedNode.right);
            }
        }   
    }
