package DataStructures.Trees;

public class BinarySearchTree  {
    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
        System.out.println();
//        intTree.traversePostOrder();
//        System.out.println();
//        intTree.traversePreOrder();
//        System.out.println();

//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(32));
//        System.out.println(intTree.get(8888));
//
//        System.out.println(intTree.min());
//        System.out.println(intTree.max());


        intTree.delete(25);
        intTree.traverseInOrder();
    }
}

/* NOTES
 * 1. Trees store data as Nodes and each Node can have multiple children, but we will only look at Binary Search Tree
 * 2. Retrieval, Removal, Insertion all operation are preformed in O(log(N))
 * 3. JDK has a TreeMap class that is a Red Black Tree which is an auto-balancing tree
 */
