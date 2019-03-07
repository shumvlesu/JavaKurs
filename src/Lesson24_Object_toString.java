import static java.lang.System.*;

public class Lesson24_Object_toString {
  public static void main(String[] args) {
    Human7 man = new Human7("Bob", 42);
    out.println(man);
  }
}

class Human7 {

  private String name;
  private int age;

  Human7(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Name: " + name + ", Age: " + age;
  }

}