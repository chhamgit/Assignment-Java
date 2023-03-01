public class Person {
    private String lstname;
    private String firstname;
    private int birthdate;

    public String getLstname(){
        return lstname;
    }
    public void setLstname(String lstname){
        this.lstname = lstname;
    }
    public String getFirstname(){
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public int getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }

    public String toString(){
        return "LastName:" + this.lstname + "\n"+
                "FirstName: " + this.firstname + "\n"+
                "Birthday: " + this.birthdate ;
    }
}
