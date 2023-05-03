package method;

//import org.example.MyOwnClass;

public class ReferenceVariableHoldsObjectAddress {
    public static void main(String[] args) {

        //This object is lost for us -- neither assigned nor returned
        new MyOwnClass();

        // Two reference variables point to the same object
        MyOwnClass var1 = new MyOwnClass();
        MyOwnClass var2 = var1;
        System.out.println(var1.hashCode());
        System.out.println(var2.hashCode());
    }
}