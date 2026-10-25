public class Main {

    public static void main(String[] args) {
        StudyPlanner student = new StudyPlanner();

        System.out.println("Smart Study Planner");
        System.out.println();

        System.out.println("Theory First:");
        student.setStudyBehaviour(new TheoryFirst());
        student.startStudy();

        System.out.println();

        System.out.println("Practice First:");
        student.setStudyBehaviour(new PracticeFirst());
        student.startStudy();

        System.out.println();

        System.out.println("Revision First:");
        student.setStudyBehaviour(new RevisionFirst());
        student.startStudy();

        System.out.println();
        System.out.println("Studying planning completed.");

    }
}
