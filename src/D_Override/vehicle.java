package D_Override;

public class vehicle {
    //constructor
    public vehicle() {
        System.out.println("constructor");
    }

    public vehicle(int a) {
        System.out.println("constructor " + a);
    }

    private int wheels = 4;

    void getColor() {
        System.out.println("Green");
    }

    void getWheels() {
        System.out.println("wheels number " + wheels);
    }


}
