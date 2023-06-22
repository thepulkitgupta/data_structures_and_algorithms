package DataStructures.Trees;

import Helpers.TreeNode;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root==null){
            root= new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root==null)
            return;
        else {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        if(root==null)
            return;
        else {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder(){
        if(root==null)
            return;
        else {
            root.traversePostOrder();
        }
    }

    public TreeNode get(int value){
        if(root==null)
            return null;
        else return root.get(value);
    }

    public int min(){
        if(root==null)
            return Integer.MIN_VALUE;
        else return root.min();
    }

    public int max(){
        if(root==null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }

    public void delete(int value){
        //call another delete method that will find the value and return the node if no change needed
        //or will do the replacement and return that
        root = delete(root,value);
    }


    //the delete method will return null or the node that should be set
    private TreeNode delete(TreeNode subTree, int value){

        //return the subtree node if the node is null
        if(subTree==null)
            return subTree;

        //if that is not the case we need to travers the left or right subtree

        //let's go to left subtree
            //check if the  value is less than the parent node
        if(value < subTree.getData()){
            //now what we will call the delte of the leftchild so that we can check if the value exists there or not
            //also
            subTree.setLeftChild(delete(subTree.getLeftChild(),value));

        }
        //go to right subtree
        else if(value > subTree.getData()){
            subTree.setRightChild(delete(subTree.getRightChild(),value));
        }
        //the only remaing case is that we found our node and we have to return the appropriate value
        else {
                //now we need to check if it's a leaf node or it has a child or not
                if(subTree.getLeftChild() ==null){
                    return subTree.getRightChild();
                }
                else if(subTree.getRightChild() ==null){
                    return subTree.getLeftChild();
                }

                //find the largest value from the left sub tree to become the node.
                subTree.setData(subTree.getLeftChild().max());

                //delete the max node
                //this is especially important if the immediate node that is the left child is the max value
               subTree.setLeftChild(delete(subTree.getLeftChild(), subTree.getData()));


        }

        return subTree;

    }
}
