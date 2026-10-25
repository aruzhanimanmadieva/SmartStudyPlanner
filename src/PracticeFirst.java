public class PracticeFirst implements StudyBehaviour {

    @Override
    public void startStudying() {
        int totalTasks = 10;
        int completedTasks = 4;
        int remainingTasks = totalTasks - completedTasks;

        System.out.println("First, solve practical tasks. ");
        System.out.println("Total tasks: " + totalTasks);
        System.out.println("Completed tasks: " + completedTasks);
        System.out.println("Remaining tasks: " + remainingTasks);
    }
}
