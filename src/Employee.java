public class Employee {
    // Static Variable companyName - Shared among all objects of a Class .i.e. emp1 and emp2
    static String companyName = "Smart Applications International";
    String employeeName;

    Employee(String employeeName){
        this.employeeName = employeeName;
    }

    void show(){
        System.out.println("My name is " + employeeName + " and I work for " + companyName);
    }
}
