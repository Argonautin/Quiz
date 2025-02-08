// Importowanie niezbędnych klas z biblioteki standardowej Java
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicjalizacja obiektu Questions,przechowujego bazę pytań.
        Questions questions = new Questions();
        
        // Pobranie tablicy pytań
        Question[] questionBank = questions.getQuestionBank();
        
        // Inicjalizacja obiektu Scanner odczytującego odpowiedzi od użytkownika.
        Scanner scanner = new Scanner(System.in);
        
        // Wynik użytkownika.
        int score = 0;

         // Wyświetlenie tekstu pytania.
        for (Question question : questionBank) {
            System.out.println(question.getText());
            
            // Wyświetlenie odpowiedzi dla danego pytania.
            List<Answer> answers = question.getAnswers();

            for (int i = 0; i < answers.size(); i++) {
                System.out.println((char)('a' + i) + ") " + answers.get(i).text);
            }
            
            // Wybór odpowiedzi przez użytkownika.
            System.out.print("Wybierz odpowiedź (a, b, c, d): ");
            
            char answerChar = scanner.next().charAt(0);
            
            int answerIndex = answerChar - 'a';

            // Sprawdzenie, czy wybrana odpowiedź jest poprawna.
            if (answers.get(answerIndex).isCorrect) {
                score++;
                System.out.println("Poprawna odpowiedź!");
            } else {
                System.out.println("Niepoprawna odpowiedź.");
            }
            
            // Wyświetlenie aktualnego wyniku użytkownika.
            System.out.println("Twój wynik: " + score + "/" + questionBank.length);
            System.out.println(); 
        }
        
        
        scanner.close();
    }
}


//Adam Kamiński 123720 orarz Dawid Kikowski 122735 