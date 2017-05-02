/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        if(root == null){
            return true;
        }
        if(root.left != null && max(root.left) >= root.data){
            return false;
        }
        if(root.right != null && min(root.right) <= root.data){
            return false;
        }
        return checkBST(root.left) && checkBST(root.right);
    }
    int max(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }
    int min(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
