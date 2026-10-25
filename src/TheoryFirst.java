public class TheoryFirst implements StudyBehaviour {

    @Override
    public void startStudying() {
        int totalTopics = 5;
        int completedTopics = 2;
        int remainingTopics = totalTopics - completedTopics;

        System.out.println("First, study the theory.");
        System.out.println("Total topics: " + totalTopics);
        System.out.println("Completed topics: " + completedTopics);
        System.out.println("Remaining topics: " + remainingTopics);
    }
}
