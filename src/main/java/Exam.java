public class Exam {
    private int examId;
    private String examName;
    private String examType;

    public Exam(int examId, String examName, String examType) {
        this.examId = examId;
        this.examName = examName;
        this.examType = examType;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Type: %s", examId, examName, examType);
    }
}