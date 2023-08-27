

public class CodeTest {
    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }

        //? Advanced for loop
        for(int num : myArray) {
            System.out.println(num);
        }
    }
}
