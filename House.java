package ph.com.bpi.hello;

public class House {
	String titleHouse; // attribute

    void openWindow() { // method
        System.out.println("Opening the window of my " + titleHouse);
    }

    public static void main(String[] args) {
      House myHouse = new House();
      myHouse.titleHouse = "house";
      myHouse.openWindow();
    }
}

