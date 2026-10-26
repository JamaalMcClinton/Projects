import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        cars.add("Dodge");
        cars.add("Kia");
        cars.add("Chevrolet");
        cars.add("Ford");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Original String ArrayList:");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println();

        System.out.println("Original Integer ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Operation 1
        cars.remove(1);
        numbers.remove(1);

        // Operation 2
        cars.add("Honda");
        numbers.add(50);

        System.out.println();
        System.out.println("Updated String ArrayList:");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println();

        System.out.println("Updated Integer ArrayList:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}