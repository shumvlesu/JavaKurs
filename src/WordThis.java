public class WordThis {
  public static void main(String[] args) {
    Human man = new Human();
    man.setAge(36);
    man.setName("Sergey");
    man.getInfo();
  }
}

class Human{
  String name;
  int age;

  public void setName(String myName) {
    this.name = myName;
  }

  public void setAge(int myAge) {
    this.age = myAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void getInfo(){
    System.out.println(name+", "+age);
  }

}