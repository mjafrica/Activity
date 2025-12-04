package ph.com.bpi.hello;

public class MyThingsM2Activity1 {
    public static void main(String[] args) {
    	
        Book myBooks = new Book();
        myBooks.titleBook = "Programming";
        myBooks.read();
        
        House myHouse = new House();
        myHouse.titleHouse = "house";
        myHouse.openWindow();

        Tree myTree = new Tree();
        myTree.titleTree = "Tree";
        myTree.grow();
    }

}
