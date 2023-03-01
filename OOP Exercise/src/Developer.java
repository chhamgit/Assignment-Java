public class Developer extends Employee{
    public static String comments = "Good";

    public Developer(String lastName, String firstName, int BirthOfDate, double salary,int years,String holiday,String comments){
        super(lastName,firstName,BirthOfDate,salary,years,holiday);

    }

    public  void printEmployeeDetails() {
        System.out.println( "5. Add Constructor so we can create a Developer from an Employee Object(--Already--");
        System.out.println("Employee lastName     :  " + lastName);
        System.out.println("Employee firstName   :  " +  firstName);
        System.out.println("Employee BirthOfDate   :  " + birthOfDate);
        System.out.println("Employee Salary : salary " +  salary);
        System.out.println("Employee Sears : years " +  years);
        System.out.println("Employee Holiday : holiday " +  holiday);
        System.out.println("Employee Coment: Comment " +  comments);
    }

    public static void main(String args[]) {
        // TODO code application logic here
        Developer  emp = new Developer("Dararaksmey", "Chham",1995,800,2,"Weekend","good");
        emp.printEmployeeDetails();

    }
}
