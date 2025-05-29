import java.util.ArrayList;
import java.util.Scanner;

public class QuizService {
    ArrayList<Question> questions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QuizService() {
        
        questions.add(new Question(
            "What is the capital of India?",
            new String[]{"Mumbai", "New Delhi", "Chennai", "Kolkata"},
            1
        ));
        questions.add(new Question(
            "Which company developed Java?",
            new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"},
            2
        ));
        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"this", "super", "extends", "implements"},
            2
        ));
    }

    public void startQuiz() {
        int score = 0;

        for (Question q : questions) {
            q.display();
            System.out.print("Your answer (1-4): ");
            int userAns = sc.nextInt();

            if (q.isCorrect(userAns)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Quiz Over! You scored " + score + " out of " + questions.size());
    }
}
