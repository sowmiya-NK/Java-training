package C_Method;

import javax.crypto.spec.PSource;

public class C_method {
private String mgs="Hello sowmiya!!!";
    static int add() {
        return 10 + 10;
    }

    //method overloading
    void method() {
        System.out.println("Method overloading");
    }

    void method(String mgs) {
        System.out.println(mgs);
    }

    void method(int a, int b) {
        System.out.println(a + b);
    }

    static int method(int x, int y, int z) {
        return x + y + z;
    }


    public static void main(String[] args) {

        C_method c = new C_method();

        int sum = C_method.add();
        System.out.println("sum is = " + sum);
        c.method();//method overloading
        c.method("method overriding");//overriding
        c.method(12, 12);
        int threeAdd = C_method.method(10, 10, 10);
        System.out.println(threeAdd);

        //2nd class
        secondclass s=new secondclass();
        s.print(c.mgs);

    }
}

class secondclass extends  C_method{
    void print(String mgs){
        System.out.println(mgs);
    }


}
