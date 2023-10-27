package D_Override;

public class Override {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        vehicle v1 = new vehicle(1);
        v.getColor();
        v.getWheels();

        Car c = new Car();
        c.getColor();
        ;
        c.getWheels();

        //upcasting
        vehicle vc = new Car();
        vc.getColor();//child class print
        vc.getWheels();

        //downcasting
    }
}
