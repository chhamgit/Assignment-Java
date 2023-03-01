import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

            List<Artist> listArtists = new LinkedList<>();
            Artist artdara = new Artist();
            artdara.setId(1);
            artdara.setName("Chham Dararaksmey");
            artdara.setGender('M');
            listArtists.add(artdara);
//            Preap Sovath
            Artist artVan = new Artist();
            artVan.setId(2);
            artVan.setName("Preap Sovath");
            artVan.setGender('F');
            listArtists.add(artVan);
            //Aok Sokunkanha
            Artist aok = new Artist();
            aok.setId(3);
            aok.setName("Aok Sokunkanha");
            aok.setGender('F');
            listArtists.add(aok);

            Album newSong = new Album();
            newSong.setId(1);
            newSong.setName("Midada Khmer song 2020");
            newSong.setYear(2008);
            newSong.setArtist(artdara);
            newSong.getTracks().add(new Tracks(1,"1. Cheab Bak Dob Chob Snea-Sa Paun MidadaVol.259 - DNC","Midada",3.4f));
            newSong.getTracks().add(new Tracks(2,"2. Bouros Manak Del Kit Dor Oun-Sa Paun Midada Vol.261","Midada",4.3f));
            newSong.getTracks().add(new Tracks(3,"3. Kroub Yang Derm Bei Oun-Sa Paun MidadaVol.231 - DNC","Midada",3.3f));

            System.out.println(newSong.toString());

            // Album 2
            Album PreabSong = new Album();
            PreabSong.setId(1);
            PreabSong.setName("Preab Sovath Khmer Song 1995");
            PreabSong.setYear(2007);
            PreabSong.setArtist(artVan);
            PreabSong.getTracks().add(new Tracks(1,"1. Lea Ko Lab Kmao-Preab Sovath Vol.220 - DNC","Preab Sovath",3.2f));
            PreabSong.getTracks().add(new Tracks(2,"2. Touch Chit - DNC","Preab Sovath",5.3f));
            PreabSong.getTracks().add(new Tracks(3,"3. Ak Thy Bay Kork Chheam-Preab SovathVol.235 - DNC","Preab Sovath",6.3f));

            System.out.println(PreabSong);

            // Album 3
            Album veasnaSong = new Album();
            veasnaSong.setId(1);
            veasnaSong.setName("keo veasna Khmer Song 2018");
            veasnaSong.setYear(2022);
            veasnaSong.setArtist(aok);
            veasnaSong.getTracks().add(new Tracks(1,"០១ កុលាបពុលដី","keo veasna",7.2f));
            veasnaSong.getTracks().add(new Tracks(2,"០២ ឥទ្ធិពលដុល្លា","LALA",5.3f));
            veasnaSong.getTracks().add(new Tracks(3,"០៣ ស្រលាញ់គេមិនដឹងដើម្បីអ្វី","Sweet",3.3f));

            System.out.println(veasnaSong);


            System.out.println(" === which artists have longer tracks ===");

            List<Album> allArtistAlbums = new ArrayList<>();
            allArtistAlbums.add(newSong);
            allArtistAlbums.add(PreabSong);
            allArtistAlbums.add(veasnaSong);

            Optional<Album> longerTrack = allArtistAlbums.stream()
                    .reduce((album1, album2) -> album1.getTracks().size() > album2.getTracks().size() ? album1 : album2);

            if (longerTrack.isPresent()) {
                System.out.println(longerTrack.get().toString());
            } else {
                System.out.println("Error!");
            }
    }
}