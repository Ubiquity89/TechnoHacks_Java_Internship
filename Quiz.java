import java.util.Scanner;
 
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
 
        String[] questions= {
            "1. In 1768, Captain James Cook set out to explore which ocean?",
            "2. Which of the following is not an international organisation?",
            "3. In the United States, football is called soccer. So what is American football called in the United Kingdom?",
            "4. Which of the following disorders is the fear of being alone?",
            "5. Which of the following is a song by the German heavy metal band Scorpions?"
            
        };
        
        String[] options = {
            "A. Pacific Ocean\t B. Atlantic Ocean \nC. Indian Ocean\tD. Arctic Ocean",
            "A. FIFA\t B. NATO \n C. ASEAN\t D. FBI",
            "A. Rugby\t B. American football \n C. Handball\t D. Combball",
            "A. Agoraphobia\t B. Aerophobia\n C. Acrophobia\t D. Arachnophobia",
            "A. Stairway to Heaven\t B. Wind of Change\n C. Don’t Stop Me Now\t D. Hey Jude"
        };
        String[] answers = {"A", "D", "B","A","B"};
 
        System.out.println("Welcome to 'ONLINE QUIZ SHOW'");
        System.out.println("Answer the following questions:");
 
        for(int i=0;i<questions.length;i++) {
            System.out.println("Question "+(i+1)+": ");
            System.out.println("Options: "+options[i]);
            System.out.println("Your answer: ");
            String user_answer= scanner.nextLine().toLowerCase();

            if(user_answer.equals(answers[i])) {
                System.out.println("Correct Answer");
                score++;
            }
            else {
                System.out.println("Incorrect, The correct answer is"+ answers[i]);
            }
        }
        System.out.println("Quiz completed! Your final score is"+ score+"out of"+ questions.length);
        scanner.close();
    }
}