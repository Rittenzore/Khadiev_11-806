public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    //положительное число - данный объект больше переданного в кач-ве параметра
    //отрицательное число - меньше
    //0 - равен
    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }
}
