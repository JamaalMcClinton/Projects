import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int length;
    private int[] myArray;

    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    public void fillRand() {
        Random rand = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    public int get(int element) {
        return myArray[element];
    }

    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    public int size() {
        return myArray.length;
    }

    public boolean isEmpty() {
        return myArray.length == 0;
    }

    public void sort() {
        Arrays.sort(myArray);
    }

    public String toString() {
        return Arrays.toString(myArray);
    }
}