import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class TrackTester {
    public static void main(String[] args) {

        HashMap<String, String> tracks = new HashMap<String, String>();

        tracks.put("Love the Way You Lie", "Just gonna stand there and watch me burn...");        
        tracks.put("Monster", "I'm friends with a monster that's under my bed...");
        tracks.put("Let It Be", "Let it be, let it be, let it be, let it be...");
        tracks.put("Yankee and the Brave", "Go Go Go, Go Go Go Go");

        Set<String> myKeys = tracks.keySet();

        for(String key : myKeys) {
            System.out.println(key);
            System.out.println(tracks.get(key));
        }

    }
}
