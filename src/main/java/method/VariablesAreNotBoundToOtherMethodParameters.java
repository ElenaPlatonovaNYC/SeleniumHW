package method;


//import org.example.MyOwnClass;

public class VariablesAreNotBoundToOtherMethodParameters {
    public static void main(String[] args) {

        MyOwnClass obj = new MyOwnClass();
        int price = 500;
        //Despite we change the values inside the method, variable price is not modified
        obj.simpleMethod("red", price);
        System.out.println(price);
    }
}