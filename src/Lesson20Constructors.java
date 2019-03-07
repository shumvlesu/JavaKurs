public class Lesson20Constructors {
  public static void main(String[] args) {
    Human2 man = new Human2();
    System.out.println(man.getName());

    Human2 man2 = new Human2("Сергей");
    System.out.println(man2.getName());

  }
}

class Human2{


  private String name;
  private int age;

  //конструкторы и перегрузка методов
  public Human2(){
    System.out.println("Привет из моего первого конструктора! :)");
    this.name = "Никто";
    this.age = 0;
  }

  public Human2(String name){
    System.out.print("Привет ");
    this.name = name;
  }

  public Human2(String name, int age){
    System.out.print("Привет ");
    this.name = name;
    System.out.print("Тебе ");
    this.age = age;
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
}