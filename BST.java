
package bstpracticeapplication;

/**
 *
 * @author Trevor
 */
public class BST {
   private BSTNode root;
   
   public BST(){
       root = null;
   }
   public boolean isEmpty(){
       return root == null;
   }
   public void insert(int data){
       root = insert(root,data);
   }
   private BSTNode insert(BSTNode node, int data){
       if(node == null) node = new BSTNode(data);
       else{
           if(data <= node.getData()) node.left = insert(node.left, data);
           else node.right = insert(node.right, data);
       }
       return node;
   }
   public void delete(int n){
       if(isEmpty()) System.out.println("Tree Empty, cannot delete");
       else if(search(n) == false) System.out.println("The value " + n + " wasn't located in the tree for deletion.");
       else{
           root = delete(root, n);
           System.out.println(n + " was successfuly deleted from tree.");
       }
   }
   private BSTNode delete(BSTNode root, int k){
       BSTNode p, p2, n;
       if(root.getData() == k){
           BSTNode leftTree, rightTree;
           leftTree = root.getLeft();
           rightTree = root.getRight();
           if(leftTree == null && rightTree == null) return null;
           else if(leftTree == null){
               p = leftTree;
               return p; //New root
           }
           else{
               p2 = rightTree;
               p = rightTree;
               while(p.getLeft() != null) p = p.getLeft();
               p.setLeft(leftTree);
               return p2; //New root
           }
       }
       if(k< root.getData()){
           n = delete(root.getLeft(), k);
           root.setLeft(n);
       }
       else{
           n = delete(root.getRight(), k);
           root.setRight(n);
       }
       return root;
   }
   public boolean search(int val){
       return search(root, val);
   }
   private boolean search(BSTNode myRoot, int val){
       boolean found = false;
       while((myRoot != null) && !found){
           int rval = myRoot.getData();
           if(val < rval) myRoot = myRoot.getLeft();
           else if(val>rval) myRoot = myRoot.getRight();
           else{
               found = true;
               break;
           }
           found = search(myRoot, val);
       }
       return found;
   }
  public void inorder(){
      inorder(root);
  }
  private void inorder(BSTNode r){
      if( r != null){
          inorder(r.getLeft());
          System.out.print(r.getData() + ",");
          inorder(r.getRight());
      }
  }
  public void preorder(){
      preorder(root);
  }
  private void preorder(BSTNode r){
      if(r != null){
          System.out.println(r.getData() + ",");
          preorder(r.getLeft());
          preorder(r.getRight());
      }
  }
  public void postorder(){
      postorder(root);
  }
  private void postorder(BSTNode r){
      if(r != null){
          postorder(r.getLeft());
          postorder(r.getRight());
          System.out.println(r.getData() + ",");
      }
  }
}
