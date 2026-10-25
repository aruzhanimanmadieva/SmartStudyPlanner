public class RevisionFirst implements StudyBehaviour {

    @Override
    public void startStudying() {
        int totalQuestions = 10;
        int correctAnswers = 7;
        int incorrectAnswers = totalQuestions - correctAnswers;

        System.out.println("First, revise the previous material. ");
        System.out.println("Total questions: " + totalQuestions);
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Incorrect answers: " + incorrectAnswers);
    }
}

