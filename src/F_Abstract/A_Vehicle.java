package F_Abstract;

abstract public class A_Vehicle {
    abstract void stop();


    int wheels = 2;
}

  class twoWheelers extends A_Vehicle {

    void getWheels() {
        System.out.println(wheels);
    }

      @Override
      void stop() {

      }


  }
