public class Trends {

  public static void main(String[] args) {
    MyTread potok1 = new MyTread();
    potok1.start();

    System.out.println("Thread there");

  }


}

class MyTread extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Thread " + i);
    }
  }

}