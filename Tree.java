package ph.com.bpi.hello;

public class Tree {
	String titleTree; // attribute

    void grow() { // method
        System.out.println("My " + titleTree + " is growing");
    }

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.titleTree = "Tree";
        myTree.grow();
    }
}
