public class Questions {
    private Question[] questionBank;

    public Questions() {
        utworzenieBazyPytan();
    }

    private void utworzenieBazyPytan()
    {
        questionBank = new Question[]{
                new Question("Ile to jest 2 + 2?",
                        new Answer[]{
                                new Answer("1", false),
                                new Answer("2", false),
                                new Answer("3", false),
                                new Answer("4", true)
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
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
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
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
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
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
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
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
                        }
                ),
                new Question("Co jest stolicą Polski?",
                        new Answer[]{
                                new Answer("Kraków", false),
                                new Answer("Gdańsk", false),
                                new Answer("Poznań", false),
                                new Answer("Warszawa", true)
                        }
                )
        };
    }

    public Question[] getQuestionBank() {
        return questionBank;
    }
}