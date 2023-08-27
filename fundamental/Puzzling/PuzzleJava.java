import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random rand = new Random(); 

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            randList.add(rand.nextInt(20));
        }
        return randList;
    }

    public String getRandomLetter() {
        String[] allChars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String randChar = allChars[rand.nextInt(26)];
        return randChar;
    }

    public String generatePassword() {
        String password = "";
        for(int i = 1; i <= 8; i++) {
            String newChar = this.getRandomLetter();
            password += newChar;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 1; i <= length; i++) {
            String password = this.generatePassword();
            passwordSet.add(password);
        }
        return passwordSet;
    }

    public ArrayList<String> shuffleArray(ArrayList<String> arrayToShuffle) {
        for(int i = 0; i < arrayToShuffle.size(); i++) {
            int randIndex = arrayToShuffle.size() - 1;
            String holder = arrayToShuffle.get(i);
            String randString = arrayToShuffle.get(rand.nextInt(randIndex));
            arrayToShuffle.set(i, randString);
            arrayToShuffle.set(randIndex, holder);
        }
        return arrayToShuffle;
    }
}
