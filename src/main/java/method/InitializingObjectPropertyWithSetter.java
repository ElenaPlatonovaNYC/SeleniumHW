package method;

//import org.example.MyOwnClass;

public class InitializingObjectPropertyWithSetter {
    public static void main(String[] args) {

        MyOwnClass anotherVariable = new MyOwnClass();
        // Title is not initially initialized
        System.out.println("Title is " + anotherVariable.getTitle());
        anotherVariable.setTitle("Olga");
        // Now title is initialized with setter above
        System.out.println("Title is " + anotherVariable.getTitle());
    }
}