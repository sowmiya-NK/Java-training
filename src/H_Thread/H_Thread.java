package H_Thread;

public class H_Thread extends Thread {
    public  void run(){
        System.out.println("runing");
    }
    public static void main(String[] args) {
        H_Thread thread=new H_Thread();
        thread.start();//inside thread function
    }
}
