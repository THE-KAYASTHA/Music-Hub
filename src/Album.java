import java.util.ArrayList;
import java.util.List;

public class Album {


    private List<Song>  songList;
    private String artistName;
    private String albumName;


    public Album(String albumName,String artistName){

        this.albumName=albumName;
        this.artistName=artistName;
        songList=new ArrayList<>();

    }

    public Album(String albumName,String artistName,List<Song> songList){
        this.albumName=albumName;
        this.artistName=artistName;
        this.songList=songList;


    }


    public boolean findSong(String title){
        for(Song song:songList){
            if(song.getSongTitle().equals(title)){
                return true;
            }



              }


        return false;
    }

    public String addNewSong(String title,double duration){

        if(findSong(title)==false){
            Song newSong=new Song(title,duration);
            songList.add(newSong);

            return "New song has been added to the list";


        }
        else{
            return "The song is already exist in the Song List";
        }
    }

    public void addToPlaylist(List<Song> playlist,int songNo){

        int idx=songNo-1;

        if(idx<songList.size()){
            playlist.add(songList.get(idx));
        }



    }

    public String addToPlaylist(List<Song> playlist,String title){

        for(Song song:songList) {
            if (song.getSongTitle().equals(title)) {
                 playlist.add(song);
                 return "Song added successfully";
            }

        }
            return "Song not found";

        }

}
