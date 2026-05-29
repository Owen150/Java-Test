public class Student {
    static String schoolName = "Strathmore University";
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("My name is " + name + " and I am " + age + " years old." + " I attend " + schoolName +".");
    }
}
