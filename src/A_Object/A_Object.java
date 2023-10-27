package A_Object;//package

public class A_Object {
    String firstName = "sowmiya";
    static int a = 10;
    final int b=20;


    public static void main(String[] args) {
        System.out.println(a);
        A_Object one = new A_Object();//object creation
        System.out.println(one);
        System.out.println(one.firstName);
        System.out.println(one.b);


        A_Object two = new A_Object();
        System.out.println(two);
        System.out.println(two.firstName);

    }
}
