package method;

public class MyMain {

    public static void main(String[] args) {

        MyOwnClass myOwnClass = new MyOwnClass();
        MyOwnClass referenceVariable = new MyOwnClass();
        System.out.println("Hashcode of created object is " + referenceVariable.hashCode());
        myOwnClass.myMethod(referenceVariable);

        //TODO next time
//        myOwnClass.myMethod(referenceVariable);
//        System.out.println("Title is " + anotherVariable.getTitle());
    }
}