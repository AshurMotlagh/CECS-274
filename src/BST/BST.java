package BST;

public class BST {
    private Node root;

    public class Node {
        private int value;
        private Node lC;
        private Node rC;

        public Node(int v){
            value =v;
            lC = null;
            rC = null;
        }
        public int getValue(){
            return value;
        }
        public void setRight(Node n){
            rC = n;
        }
        public void setLeft(Node n){
            lC = n;
        }
        public Node getRight(){
            return rC;
        }
        public Node getLeft(){
            return lC;
        }
    }

    public BST(){
        root = null;
    }
    public void display(){
        if(root == null)
            System.out.println("Empty Tree");
        else
            display(root);
    }
    private void display(Node N){
        if (N == null){
            return;
        }
        else{
            display(N.lC);
            System.out.print(N.getValue() + ", ");
            display(N.rC);
        }
    }
    public int getRoot(){
        return root.getValue();
    }
    public void add(int x){
        if (root == null){
            root = new Node(x);
            System.out.println("New root: "+x);
        }
        else{
            add(root,x);
        }
    }
    private void add(Node N, int x){
        if (x ==N.getValue()){
            System.out.println("Duplicate Value "+ x +" will not be added");
        }
        else{
            if(x < N.getValue()){
                if(N.lC == null){
                    N.lC = new Node(x);
                }
                else
                    add(N.lC, x);
            }
            else{
                if(N.rC == null){
                    N.rC = new Node(x);
                }
                else
                    add(N.rC, x);
            }
        }
    }
    public int size() {   //size of the tree
        if(root == null)
            return 0;
        else
            return 1 + size(root.lC) + size(root.rC);
    }
    private int size(Node p){
        if (p == null)
            return 0;
        else
            return 1 + size(p.lC) + size(p.rC);
    }
    public int sum(){
        if(root == null)
            return 0;
        else
            return root.getValue() + sum(root.lC) + sum(root.rC);
    }
    private int sum(Node p){
        if (p == null)
            return 0;
        else
            return p.getValue() + sum(p.lC) + sum(p.rC);
    }
    public int height(){
        if(root == null)
            return 0;
        else
            return 1 + Math.max(height(root.lC), height(root.rC));
    }
    private int height(Node p){
        if(p == null)
            return 0;
        else
            return 1 + Math.max(height(p.lC), height(p.rC));
    }
    public int min(){
        if(root.lC==null)
            return root.getValue();
        else
            return min(root.lC);
    }
    private int min(Node N){
        if(N.lC == null)
            return  N.getValue();
        else
            return min(N.lC);
    }
    public int max(){
        if(root.rC == null)
            return root.getValue();
        else
            return max(root.rC);
    }
    private int max(Node p){
        if (p.rC == null)
            return p.getValue();
        else
            return max(p.rC);
    }
}
