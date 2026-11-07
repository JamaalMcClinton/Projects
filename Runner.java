import javax.swing.JOptionPane;

public class Runner {

    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        try {
            input = JOptionPane.showInputDialog("How many questions are on the exam?");
            questions = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("How many questions did the student miss?");
            missed = Integer.parseInt(input);

            Exam exam = new Exam(questions, missed);

            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();

            JOptionPane.showMessageDialog(null, message);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter whole numbers only.");
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "The number of questions cannot be zero.");
        }

        System.exit(0);
    }
}