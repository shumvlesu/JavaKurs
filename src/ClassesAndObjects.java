public class ClassesAndObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Сергей", 36);

        System.out.println("Меня зовут "+person1.Name+" и мне "+person1.Age+" лет.");
        Person person2 = new Person();
        person2.Name ="Вова";
        person2.Age = 20;
        System.out.println("Меня зовут "+person2.Name+" и мне "+person2.Age+" лет.");
        person1.speak(person1.Name);
        person1.speak("НЯЯЯЯЯЯЯ!!!");
        System.out.println();
        System.out.println("Количество лет до пенсии - "+person1.calculateYearsToRetirement());
    }

}

class Person{
    String Name;
    int Age;

    void setNameAndAge(String username, int userage){
        Name = username;
        Age  = userage;
    }

    int calculateYearsToRetirement(){
        int years = 65-Age;
        //System.out.println("Количество лет до пенсии - "+years);
        return years;
        //как только встречает return сразу прекращает работу метода и возвращает переменную.
        //короче после return, нет смысла ничего писать.
    }

    void speak(String Na){
        System.out.println(Na);
    }
}



