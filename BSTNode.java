
package bstpracticeapplication;

/**
 *
 * @author Trevor
 */
public class BSTNode {
    BSTNode left, right;
    int data;
    
    public BSTNode(){
        left = null;
        right = null;
        data = 0;
    }
    public BSTNode(int n){
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(BSTNode n){
        left = n;
    }
    public void setRight(BSTNode n){
        right = n;
    }
    public BSTNode getLeft(){
        return left;
    }
    public BSTNode getRight(){
        return right;
    }
    public void setData(int n){
        data = n;
    }
    public int getData(){
        return data;
    }
}
