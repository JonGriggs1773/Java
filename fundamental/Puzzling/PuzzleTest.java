import java.util.ArrayList;

public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava tester = new PuzzleJava();

        ArrayList<Integer> randNumList = tester.getTenRolls();

        String randChar = tester.getRandomLetter();
        // System.out.println(randChar);

        String password = tester.generatePassword();
        // System.out.println(password);

        ArrayList<String> passwordSet = tester.getNewPasswordSet(4);

        // for(String pass : passwordSet) {
        //     System.out.println(pass);
        // }

        // tester.shuffleArray(passwordSet);

        // for(String pass : passwordSet) {
        //     System.out.println(pass);
        // }

    
    }
}
