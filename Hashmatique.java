import java.util.HashMap;
import java.util.Set;


public class Hashmatique {
    
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Bucketlist", "im going to love a little deeper, dream a little bigger, leave all the leavers and keep all the keepers.");

        trackList.put("Broken up", "But baby im still broken up about it ive had enough of it im u to here.");

        trackList.put("Drunk Me", "Ive been sober 'cause there aint no hangover like you girl, no,no,no. ");

        String title = trackList.get("Bucketlist");
        System.out.println("Song title:" + title);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}