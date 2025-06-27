import java.util.ArrayList;
import java.util.Scanner;

public class ExamManager {
    private static final ArrayList<Exam> exams = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    private static int examCounter = 1;

    public static void examMenu() {
        int choice;
        do {
            System.out.println("\n===== EXAM MANAGEMENT =====");
            System.out.println("1. Create Exam");
            System.out.println("2. View All Exams");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> createExam();
                case 2 -> viewAllExams();
            }
        } while (choice != 0);
    }

    private static void createExam() {
        System.out.println("\n===== CREATE NEW EXAM =====");
        int id = examCounter++;

        System.out.print("Enter Exam Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Exam Type: ");
        String type = scanner.nextLine();

        exams.add(new Exam(id, name, type));
        System.out.println("Exam created successfully.");
    }

    private static void viewAllExams() {
        if (exams.isEmpty()) {
            System.out.println("No exams found.");
            return;
        }
        for (Exam e : exams) {
            System.out.println(e);
        }
    }
}