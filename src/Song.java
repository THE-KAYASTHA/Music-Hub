public class Song {


    private String songTitle;
    private double duration;




    public Song(String title, double duration) {

        this.duration=duration;
        this.songTitle=title;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public double getDuration() {
        return duration;
    }


    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
