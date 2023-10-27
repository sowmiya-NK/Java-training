package B_Object;

public class B_Class {
    //no argument no return type
    void run() {
        System.out.println("running");
    }

    //with argument with return type
    int a, b;

    int getValue(int a, int b) {
        int c = a + b;
        return c;
    }

    //with argument no return type
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    //without argument with return type
    public int x = 90;
    public int y = 10;

    int multiply() {
        int z = x * y;
        return z;
    }


    public static void main(String[] args) {
        B_Class obj = new B_Class();
        obj.run();

        int c = obj.getValue(10, 20);
        System.out.println(c);

        obj.add(20, 20);

        int m = obj.multiply();
        System.out.println(m);

        //2nd class
        dummy d = new dummy();
        d.print();
        d.addfromfirstclass(obj.x, obj.y);
    }
}

class dummy extends B_Class {
    void print() {
        System.out.println("Hello dummy class!!");
    }

    void addfromfirstclass(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }


}

