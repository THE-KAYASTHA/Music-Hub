import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Album a1=new Album("breakup","Arjit singh");

        a1.addNewSong("apna bana le",3.25);
        a1.addNewSong("tu hai aashiqi",4.05);
        a1.addNewSong("fir mohabbat",3.36);
        a1.addNewSong("khairiyat",3.40);

        Album a2= new Album("MoonChild Era","Diljit Dosanjh");

        a2.addNewSong("Champagne",3.02);
        a2.addNewSong("Lover",4.2);
        a2.addNewSong("Vibe",2.36);
        a2.addNewSong("Black and White",4.05);

        List<Song> playlist=new ArrayList<>();
        a1.addToPlaylist(playlist,"khairiyat");
        a2.addToPlaylist(playlist,3);
        a1.addToPlaylist(playlist,4);
        a2.addToPlaylist(playlist,"Vibe");

        printMenu();
        playPlaylist(playlist);
    }
    public static void playPlaylist(List<Song> playlist){

        Scanner in =new Scanner(System.in);
        int idx=0;

        boolean quit=false;

        while(quit==false){
            int choice=in.nextInt();

            switch (choice){

                case 1:
                    idx++;
                    if(idx== playlist.size()){
                        idx=0;
                    }
                    System.out.println("Now playing "+playlist.get(idx%playlist.size()).toString());
                    break;

                case 2:
                    idx--;
                    if(idx<0){
                        idx= playlist.size()-1;
                    }
                    System.out.println("Now playing "+playlist.get(idx%playlist.size()).toString());
                    break;
                case 3:
                    System.out.println("Now playing "+playlist.get(idx%playlist.size()).toString());
                    break;
                case 4:
                    Collections.shuffle(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    for(Song song:playlist){

                        System.out.println(song.toString());

                    }
                    break;
                case 7:
                    playlist.remove(idx);
                    System.out.println("The current Song has been deleted");
                    break;
                case 8:
                    quit = true;
                    break;











            }






        }
    }
    public static void printMenu(){

        System.out.println("<<<--------------->>>");
        System.out.println("1. Play the next Song");
        System.out.println("2. Play the previous Song");
        System.out.println("3. Repeat this Song");
        System.out.println("4. Shuffle the playList");
        System.out.println("5. Print the menu !!");
        System.out.println("6. Print PlayList");
        System.out.println("7. Delete the current Song");
        System.out.println("8. Exit the System");
        System.out.println("<<<--------------->>>");
        System.out.println("Enter your choice");
    }
}