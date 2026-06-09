public class Employee {
    // Static Variable companyName - Shared among all Objects of a Class .i.e. emp1 and emp2
    static String companyName = "Smart Applications International";
    // Different for every Employee Object. Not shared
    String employeeName;

    // Constructor
    public Employee(String employeeName){
        this.employeeName = employeeName;
    }

    void show(){
        System.out.println("My name is " + employeeName + " and I work for " + companyName);
    }
}
