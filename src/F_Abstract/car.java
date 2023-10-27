package F_Abstract;

public class car extends A_Vehicle {


    void drive() {
        System.out.println("drive");
    }

    @Override
    void stop() {
        System.out.println("stop");
    }
}
