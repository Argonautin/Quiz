import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Question
{
    private String text;
    private List<Answer> answers;

    public Question(String text, Answer[] answers)
    {
        this.text = text;
        this.answers = new ArrayList<>(List.of(answers));
    }

    public String getText()
    {
        return text;
    }

    public List<Answer> getAnswers()
    {
        Collections.shuffle(answers);
        return answers;
    }
}