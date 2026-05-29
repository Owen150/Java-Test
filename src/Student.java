public class Student {
    String name;
    int age;

    public String student(String name, int age){
        this.name = name;
        this.age = age;
        return "My name is " +name + " and I am " +age + " years old";
    }
}
