public class Artist {

    private int id;
    private String name;
    private char gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Id: "+ this.getId()+"\n" +
                "Name : " + this.getName() + "\n" +
                "Gender : " + this.getGender()+ "\n";
    }
}
