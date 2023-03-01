import java.io.IOException;

public class Employee extends Labelisable {
    String lastName;
    String firstName;
    int birthOfDate;
    double salary;
    int years;
    String holiday;


    public Employee(String lastName,String firstName,int BirthOfDate,double salary,int years,String holiday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthOfDate = BirthOfDate;
        this.salary = salary;
        this.years = years;
        this.holiday = holiday;


    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public int getBirthOfDate(){
        return birthOfDate ;
    }

    public void setBirthOfDate(int birthOfBirth){
        this.birthOfDate = birthOfBirth;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getYear(){
        return years;
    }

    public void setYear(int years){
        this.years = years;
    }

    public String getHoliday(){
        return holiday;
    }
    public void setHoliday(String holiday){
        this.holiday = holiday;
    }

    @Override
    public void getLabel() {
//        Implements the interface Labelisable with the Employee class to display all the data of an employee
        System.out.println("===== Implements the interface Labelisable with the Employee class to display all the data of an employee ====");
        System.out.println("Employee LastName:  " + lastName);
        System.out.println("Employee FirstName:  " +  firstName);
        System.out.println("Employee BirthOfDate:  " + birthOfDate);
        System.out.println("Employee Salary: " +  salary);
        System.out.println("Employee years: " +  years);
        System.out.println("Employee Holiday: " +  holiday);

        System.out.println("NAME : "+ name +"\n"+"COMMENT : "+ comment+"\n"+"SALARY : "+"$"+ salary + ", ");

        Developer[] developer = new Developer[4];
        developer[0] = new Developer("Dararaksmey" + ", ","Chham"+ ", ",1995,  900,2,"Weekend",Developer.comments);
        developer[1] = new Developer("Pichmaly","Chham",2000,700,2,"Weekend",Developer.comments);
        developer[2] = new Developer("Kaknika","Chham",2007,200,2,"Weekend",Developer.comments);
        developer[3] = new Developer("Daravituro","Chham",2017,100,2,"Weekend",Developer.comments);
        for(int j = 0 ; j < developer.length;j++){
            System.out.println(developer[j]);
        }


    }

    @Override
    public String toString(){
        return "LastName : "  + this.lastName +
                "FirstName : " + this.firstName +
                "BirthOfDate : " + this.birthOfDate +
                "salary : " + this.salary +
                "years : "    +  this.years +
                "Holiday : " + this.holiday;
    }

    public static void main(String args[])throws IOException {
        //create array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int i, x;

        // iterating over an array
        for (i = 0; i < arr.length; i++) {

            // accessing each element of array
            x = arr[i];
            System.out.print(x + " ");
        }

        TeamLeader[] teamleader = new TeamLeader[3];
        teamleader[0] = new TeamLeader(2);
        teamleader[1] = new TeamLeader(3);
        teamleader[2] = new TeamLeader(4);
        for(int j = 0 ; j < teamleader.length;j++){
            System.out.println(teamleader[j]);
        }

        Employee emp = new Employee ("Dararaksmey", "Chham",1995,223.40,2,"Weekend");
        emp.getLabel();
    }
}
