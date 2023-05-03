package method;

public class MyOwnClass {
    private String title;

    public MyOwnClass() {
        System.out.println("New instance is created");
    }

    public void myMethod(MyOwnClass myOwnClass) {
        System.out.println("Invoked method myMethod. Hashcode of the passed object is " + myOwnClass.hashCode());
    }

    // Method parameters are regular local variables inside the method
    public void simpleMethod(String color, int price) {
        System.out.println("Invoked simpleMethod with color=" + color + ", and price=" + price);
        price = 1;
        color = "My string!";
        System.out.println("Invoked simpleMethod with color=" + color + ", and price=" + price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}