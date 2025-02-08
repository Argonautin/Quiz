// Definiowanie klasy Questions, która przechowuje bazę pytań
public class Questions {
    private Question[] questionBank;

    // Konstruktor klasy Questions
    public Questions() {
        // Wywołanie metody inicjalizującej bazę pytań
        utworzenieBazyPytan();
    }

    // Metoda tworząca bazę pytań
    private void utworzenieBazyPytan() {
        // Inicjalizacja tablicy z obiektami typu Question
        questionBank = new Question[]{
                // Tworzenie obiektów Question 
                new Question("Ile to jest 2 + 2?", //Pytanie
                        new Answer[]{
                                new Answer("1", false), // Niepoprawna odpowiedź
                                new Answer("2", false), // Niepoprawna odpowiedź
                                new Answer("3", false), // Niepoprawna odpowiedź
                                new Answer("4", true)   // Poprawna odpowiedź
                        }
                ),
                
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
                        }
                ),
                
                new Question("Kto był pierwszym prezydentem Stanów Zjednoczonych?",
                        new Answer[]{
                                new Answer("Thomas Jefferson", false),
                                new Answer("John Adams", false),
                                new Answer("Abraham Lincoln", false),
                                new Answer("George Washington", true)
                        }
                ),
                
                new Question("Który kraj jest największy pod względem powierzchni?",
                        new Answer[]{
                                new Answer("Chiny", false),
                                new Answer("Stany Zjednoczone", false),
                                new Answer("Kanada", false),
                                new Answer("Rosja", true)
                        }
                ),
                
                new Question("Który pierwiastek chemiczny ma symbol O?",
                        new Answer[]{
                                new Answer("Ołów", false),
                                new Answer("Wodór", false),
                                new Answer("Azot", false),
                                new Answer("Tlen", true)
                        }
                ),
               
                new Question("Który aktor wcielił się w postać Tony’ego Starka (Iron Mana) w uniwersum Marvela?",
                        new Answer[]{
                                new Answer("Mark Ruffalo", false),
                                new Answer("Chris Evans", false),
                                new Answer("Chris Hemsworth", false),
                                new Answer("Robert Downey Jr.", true)
                        }
                ),
                
                new Question("Który zespół jest autorem albumu The Dark Side of the Moon?",
                        new Answer[]{
                                new Answer("The Beatles", false),
                                new Answer("Queen", false),
                                new Answer("Led Zeppelin", false),
                                new Answer("Pink Floyd", true)
                        }
                ),
                
                new Question("Kto napisał Romea i Julię?",
                        new Answer[]{
                                new Answer("Mark Twain", false),
                                new Answer("Charles Dickens", false),
                                new Answer("Jane Austen", false),
                                new Answer("William Shakespeare", true)
                        }
                ),
                
                new Question("W którym kraju odbyły się pierwsze nowożytne Igrzyska Olimpijskie w 1896 roku?",
                        new Answer[]{
                                new Answer("Francja", false),
                                new Answer("Wielka Brytania", false),
                                new Answer("Włochy", false),
                                new Answer("Grecja", true)
                        }
                ),
                
                new Question("Które zwierzę jest największym ssakiem na Ziemi?",
                        new Answer[]{
                                new Answer("Słoń afrykański", false),
                                new Answer("Orka", false),
                                new Answer("Żyrafa", false),
                                new Answer("Płetwal błękitny", true)
                        }
                )
        };
    }

    // Metoda zwracająca tablicę pytań 
    public Question[] getQuestionBank() {
        return questionBank;
    }
}


//Adam Kamiński 123720 orarz Dawid Kikowski 122735 