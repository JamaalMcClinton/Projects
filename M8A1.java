import java.io.*;
import java.util.Scanner;

public class M8A1 {
    public static void main(String[] args) {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            Scanner fileScanner = new Scanner(new File(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Skip the header row from pay.csv
            fileScanner.nextLine();

            // Write headings to output.csv
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                String empID = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                double weeklyPay;

                if (hoursWorked > 40) {
                    double regularPay = 40 * payRate;
                    double overtimeHours = hoursWorked - 40;
                    double overtimePay = overtimeHours * payRate * 1.5;

                    weeklyPay = regularPay + overtimePay;
                }
                else {
                    weeklyPay = hoursWorked * payRate;
                }

                String formattedPay = String.format("$%.2f", weeklyPay);

                String outputLine = empID + ","
                        + payRate + ","
                        + hoursWorked + ","
                        + formattedPay;

                writer.write(outputLine);
                writer.newLine();
            }

            fileScanner.close();
            writer.close();

            System.out.println("output.csv created successfully.");
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Data format error: " + e.getMessage());
        }
    }
}