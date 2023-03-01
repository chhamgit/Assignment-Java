public class Tracks {
    private int id ;
    private String name;
    private String type;
    private float min;

    public Tracks(int id, String name, String type, float min){
        this.id = id ;
        this.name = name;
        this.type = type ;
        this.min = min;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public float getMin(){
        return min;
    }
    public void setMin(float min){
        this.min = min;
    }

    @Override
    public String toString(){
        return "ID: " + this.getId()+ "\n" +
                "Name: " + this.getName()+ "\n" +
                "Type: " + this.getType()+"\n" +
                "Min: " + this.getMin() + "\n";
    }
}
