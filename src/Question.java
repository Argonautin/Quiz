// Importowanie niezbednych klas z biblioteki standardowej Java
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// Klasa Question reprezentuje pojedyncze pytanie w quizie.
public class Question {
    // Prywatne pole przechowujace tekst pytania.
    private String text;

    // Prywatne pole przechowujace liste odpowiedzi (obiekty typu Answer).
    private List<Answer> answers;

    // Konstruktor klasy Question, ktory inicjalizuje pytanie i odpowiedzi.
    public Question(String text, Answer[] answers) {
        this.text = text; // Przypisanie tekstu pytania.
        this.answers = new ArrayList<>(List.of(answers)); // Konwersja tablicy odpowiedzi na liste.
    }

    // Metoda zwracajaca tekst pytania.
    public String getText() {
        return text;
    }

    // Metoda zwracajaca liste odpowiedzi. Odpowiedzi sa losowo mieszane przed zwroceniem.
    public List<Answer> getAnswers() {
        Collections.shuffle(answers); // Mieszanie kolejnosci odpowiedzi.
        return answers; // Zwrocenie przemieszanej listy odpowiedzi.
    }
}

//Adam Kami?ski 123720 orarz Dawid Kikowski 122735 