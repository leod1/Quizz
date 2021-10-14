import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Quizz Quizz = new Quizz();
       Quizz.remplirQuizz();
       System.out.println(Quizz);



        for (Questions Question: Quizz.getQuestionList()) {
            String isTrue = null;
            System.out.println(Question.getLabel());
            for (Reponses Reponse: Question.getReponsesList()) {
                System.out.println(Reponse.getLabel());
                if (Reponse.isVerite()==true){
                    isTrue = Reponse.getLabel();
                }

            }
            Scanner scanner = new Scanner(System.in);
            String valeur = scanner.nextLine();
            System.out.println(valeur);

            if(valeur.equalsIgnoreCase(isTrue)){
                System.out.println("Bravo");
                Quizz.setScore(Quizz.getScore()+1);
            }
            else {
                System.out.println("Mauvaise réponse");
            }
        }
        System.out.println(Quizz.getScore());
    }
}
