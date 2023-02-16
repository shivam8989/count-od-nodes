package Binary_Tree;

public class Count_of_Nodes{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftcount  = count(root.left);
        int rightcount = count(root.right);
        int treeCount = leftcount+rightcount+1;

        return treeCount;
    }

    public static void main(String args []){
        /*
              1
             / \
            2   3
           / \   \
          4   5   6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(count(root));

    }
}
