public class Main {

    public static void main(String[] args) {


        Child myChild = new Child(12, "Tom", "Hello");

        Child myChild2 = new Child("Hiya");

        System.out.println( myChild.getName());
        System.out.println( myChild.getAge());
        System.out.println( myChild.getClassValue());
        System.out.println( "Second");

        System.out.println( myChild2.getName());
        System.out.println( myChild2.getAge());
        System.out.println( myChild2.getClassValue());



    }
}
