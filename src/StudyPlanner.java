public class StudyPlanner {

    private StudyBehaviour studyBehaviour;

    public void setStudyBehaviour(StudyBehaviour studyBehaviour) {
        this.studyBehaviour = studyBehaviour;
    }
    public void startStudy() {
        studyBehaviour.startStudying();
    }
}
