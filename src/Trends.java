//Два примера создания потоков
public class Trends {

  public static void main(String[] args) {
    //Первый метод создания потока
    MyTread potok1 = new MyTread();
    potok1.start();

    //Второй метод создания потока
    Thread potok2 = new Thread(new Runner());
    potok2.start();

    //Выводим сообщение из основного потока, который main
    System.out.println("Thread there");

  }
}

class Runner implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Thread potok 2 -" + i);
    }
  }
}

class MyTread extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Thread potok 1 -" + i);
    }
  }

}