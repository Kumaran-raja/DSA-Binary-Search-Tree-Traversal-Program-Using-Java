// post order
class Node {
    int data;
    Node left, right;
 
    Node(int v)
    {
        data = v;
        left = right = null;
    }
}
 
class Main {
 
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        System.out.println("Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("Pre Order");
        preOrder(root);
        System.out.println();
        System.out.println("Post order");
        postOrder(root);
        problem2();
      
    }


    public static void problem2(){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.left.right = new Node(9);
        root.left.left.right.left = new Node(1);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        root.right.right.left = new Node(8);
        System.out.println();
        System.out.println("Problem2 Inorder");
        inOrder(root);
        System.out.println();
        System.out.println("Problem2 Pre Order");
        preOrder(root);
        System.out.println();
        System.out.println("Problem2 Post order");
        postOrder(root);
    
    }

    public static void postOrder(Node node)
    {
        if (node == null)
            return;
            postOrder(node.left);
            postOrder(node.right);
        System.out.print(node.data + " ");
        
    }

    
    public static void inOrder(Node node)
    {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);    
    }
    
    public static void preOrder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);  
       
    }
}