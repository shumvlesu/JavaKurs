public class GettersAndSetters {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Сергей");
        person1.setAge(36);
        person1.speak();

    }

    static class Person{
        private String name;
        private int age;

        public void setName(String userName) {
            if (userName.isEmpty()){
                System.out.println("Введено пустое значение.");
            }
            else
                {this.name = userName;}
        }
        
        public String getName(){
            return name;
        }

        public void setAge(int userAge) {
            if (userAge<0){
                System.out.println("Введите корректный возраст.");
            }
            else {this.age = userAge;}
        }

        public int getAge() {
            return age;
        }

        void speak(){
            System.out.println(getName()+" "+getAge());

        }
    }

}

