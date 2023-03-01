import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album {

    private int id ;
    private String name;
    private int year;
    private Artist artist;
    private final List<Tracks> tracks = new ArrayList<Tracks>();

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
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public Artist getArtist(){
        return artist;
    }

    public void setArtist(Artist artist){
        this.artist = artist;
    }

    public List<Tracks>getTracks(){
        return tracks;
    }

    @Override
    public String toString(){
        String displayTracks = this.getTracks().stream().map(s ->  s.toString() + "\n").collect(Collectors.joining());

        return "Id: " + this.getId()+ "\n" +
                "Name: " + this.getName() +"\n" +
                "Year: " + this.getYear()+"\n" +
                "==== Artists ==== "+ "\n" + this.getArtist().toString() +"\n" +
                "==== Tracks ==== "+ "\n" + displayTracks;

    }
}
