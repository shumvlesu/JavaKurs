public class LearnStatic {


  public static void main(String[] args) {
    Human3 h1 = new Human3("Bob", 16);
    Human3 h2 = new Human3("Sergey", 36);
    h1.setName("John");
    Human3.description = "Nice";

    Human3.getDescription();
    System.out.println("Создано человек: "+Human3.getCountPeople());
  }
}

class Human3 {

  private String name;
  private int age;
  //это теперь переменная класса а не объекта класса. благодаря слову static.
  public static String description;
  private static int countPeople;

  public Human3(String name, int age) {
    System.out.print("Привет ");
    this.name = name;
    System.out.println("Тебе ");
    this.age = age;
    //В конструкторе теперь статической переменной подсчитываю количество созданых объектов класса (людей)
    countPeople++;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  //это теперь метод класса а не метод объекта класса. благодаря слову static.
  //Статический метод не может работать с переменными объекта (например age или name)
  public static void getDescription() {
    System.out.println(description);

  }

  public static int getCountPeople(){
    return countPeople;
  }

}
