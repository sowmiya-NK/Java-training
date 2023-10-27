package J_Exception;

public class I_Exception {
    public static void main(String[] args) {
        try {
            int a = 15 / 0;
            System.out.println("Exception");

        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Zero can't be divide");
            } else {
                System.out.println(e);

            }

        }

        try {
            new Test().add();


        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}

class Test {

    void add() throws Exception {
        throw new Exception("custom Error");
    }
}


//Exception,e,new-->object
