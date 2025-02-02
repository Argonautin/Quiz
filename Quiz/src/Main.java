import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Questions questions = new Questions();
        Question[] questionBank = questions.getQuestionBank();
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questionBank)
        {
            System.out.println(question.getText());
            List<Answer> answers = question.getAnswers();

            for (int i = 0; i < answers.size(); i++)
            {
                System.out.println((char)('a' + i) + ") " + answers.get(i).text);
            }
            System.out.print("Wybierz odpowiedź (a, b, c, d): ");

            char answerChar = scanner.next().charAt(0);
            int answerIndex = answerChar - 'a';

            if (answers.get(answerIndex).isCorrect)
            {
                score++;
                System.out.println("Poprawna odpowiedź!");
            } else {
                System.out.println("Niepoprawna odpowiedź.");
            }
            System.out.println("Twój wynik: " + score + "/" + questionBank.length);
            System.out.println();
        }
        scanner.close();
    }
}