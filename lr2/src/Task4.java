public class Task4 {
    public static void main(String[] args) {
        Person person = new Person("Илья", 22, "Мужской");
        System.out.println(person.toString());
        System.out.println();
        person.setName("Настя");
        person.setAge(23);
        person.setGender("Женский");
        System.out.println(person.toString());
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format( "Имя: %s\nВозраст: %d\nПол: %s", this.getName(), this.getAge(), this.getGender());
    }
}