import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc() {
        num1 = 0.0;
        num2 = 0.0;
    }

    public void setNum1(double newNum1) {
        num1 = newNum1;
    }

    public void setNum2(double newNum2) {
        num2 = newNum2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public double getValidNumber(Scanner scan, String prompt) {
        System.out.println(prompt);

        while (!scan.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number:");
            scan.next();
        }

        return scan.nextDouble();
    }

    public String toString() {
        return "Displaying private data fields using toString():\n"
             + "Num1: " + num1 + "\n"
             + "Num2: " + num2;
    }
}