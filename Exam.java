public class Exam extends Assessment {
    private int numMissed;
    private int pointsEach;

    public Exam(int questions, int missed) {
        numMissed = missed;
        pointsEach = 100 / questions;

        int score = 100 - (missed * pointsEach);
        setScore(score);
    }

    public int getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}