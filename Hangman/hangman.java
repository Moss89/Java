import java.util.Scanner;

public class hangman {

    public static void main(String[] args) {
        startGame();
    }
        public static void startGame(){
        boolean correct = false;
        int count = 0;

            String[] stringChoices = {"hello", "world", "Tomas"};
            String wordToGuess = choices(stringChoices);
            char[] scrambled = scramble(wordToGuess);
            int incorrectCount = 0;
            Scanner myScanner = new Scanner(System.in);
            System.out.println(scrambled);
            while (!correct) {

                System.out.println("Make a guess: ");

                String guess = myScanner.next();
                char charGuess = guess.charAt(0);

                boolean found = false;
                for (int i = 0; i< wordToGuess.length(); i++){

                    if(wordToGuess.charAt(i) == charGuess) {
                        count += 1;
                        scrambled[i] = charGuess;
                        found = true;
                    }
                }
                if(found){
                System.out.println("Yay!");
                System.out.println(scrambled);
            }
                    else {
                System.out.println("Sorry!");
                incorrectCount += 1;
            }

                if (count == wordToGuess.length()){
                    correct = true;
                    System.out.println("You win!");
                    System.out.println(scrambled);
                    System.out.println("Incorrect guesses: " + incorrectCount);
                    break;
                }
            }
            System.out.println("Press Y to play again: ");
            String playAgain = myScanner.next();
            if (playAgain.equals("y") || playAgain.equals("Y")){
                startGame();
            }
            else{
                System.out.println("Goodbye!");
            }

        }


        public static String choices (String[]strArray){
            int randomChoice = (int) (Math.random() * strArray.length);
            return strArray[randomChoice];
        }
        public static char[] scramble (String beforeScramble){
            char[] nowScambled = new char[beforeScramble.length()];
            for (int i = 0; i < beforeScramble.length(); i++) {
                nowScambled[i] = '*';
            }
            return nowScambled;
        }


    }
