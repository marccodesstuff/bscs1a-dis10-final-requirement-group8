import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Guess the Words!");
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();

        System.out.println("----------");
        System.out.println("Let's begin the game!");

        int crosses = 0;
        int correct = 0;
        int score = 0;

        String[] wordList = { "Sets | 10", "Logic and Proof | 25", "Sequences | 10", "Prime and Composite Numbers | 10",
                "Subsets | 15", "Union | 5" };

        String word1 = "?";
        String word2 = "?";
        String word3 = "?";
        String word4 = "?";
        String word5 = "?";
        String word6 = "?";

        while (crosses < 3 && correct < 6) {
            System.out.println("----------");
            System.out.println("[ " + ((crosses >= 1) ? "X" : " ") + " ] " + "[ " + ((crosses >= 2) ? "X" : " ") + " ] "
                    + "[ " + ((crosses >= 3) ? "X" : " ") + " ] ");
            System.out.println("----------");
            System.out.println("");
            System.out.println("Score: " + score);
            System.out.println("GIVE A TOPIC THAT YOU'VE LEARNED IN YOUR DIS10 COURSE:");
            System.out.println("[ " + word1 + " ]");
            System.out.println("[ " + word2 + " ]");
            System.out.println("[ " + word3 + " ]");
            System.out.println("[ " + word4 + " ]");
            System.out.println("[ " + word5 + " ]");
            System.out.println("[ " + word6 + " ]");
            System.out.println("----------");

            System.out.println("Enter your answer: ");
            String answer = userInput.nextLine();

            switch (answer.toLowerCase()) {
                case ("set"):
                case ("sets"):
                case ("cardinal number of sets"):
                case ("equivalent sets"):
                case ("equivalent set"):
                case ("disjoint sets"):
                case ("disjoint set"):
                case ("numeral set"):
                case ("numeral sets"):
                case ("universal set"):
                case ("universal sets"):
                case ("empty set"):
                case ("empty sets"):
                case ("null set"):
                case ("null sets"):
                    if (word1 != "?") {
                        System.out.println("You have answered this question already.");
                        break;
                    } else {
                        word1 = wordList[0];
                        score += 10;
                        correct++;
                        break;
                    }
                case ("logic and proof"):
                case ("logic & proof"):
                case ("logic"):
                case ("proof"):
                case ("propostional logic"):
                case ("truth tables"):
                case ("logical equivalence"):
                    if (word2 != "?") {
                        System.out.println("You have answered this question already.");
                    } else {
                        word2 = wordList[1];
                        score += 25;
                        correct++;
                        break;
                    }
                case ("sequence"):
                case ("sequences"):
                case ("infinite"):
                case ("finite"):
                case ("arithmetic sequence"):
                case ("arithmetic sequences"):
                case ("geometric sequence"):
                case ("geometric sequences"):
                case ("triangular number"):
                case ("triangular numbers"):
                case ("square number"):
                case ("square numbers"):
                case ("cube number"):
                case ("cube numbers"):
                case ("fibonacci sequence"):
                case ("fibonacci sequences"):
                    if (word3 != "?") {
                        System.out.println("You have answered this question already.");
                        break;
                    } else {
                        word3 = wordList[2];
                        score += 10;
                        correct++;
                        break;
                    }
                case ("prime"):
                case ("prime number"):
                case ("prime numbers"):
                case ("composite"):
                case ("compsite number"):
                case ("composite numbers"):
                    if (word4 != "?") {
                        System.out.println("You have answered this question already.");
                        break;
                    } else {
                        word4 = wordList[3];
                        score += 10;
                        correct++;
                        break;
                    }
                case ("subset"):
                case ("subsets"):
                case ("proper subset"):
                case ("proper subsets"):
                    if (word5 != "?") {
                        System.out.println("You have answered this question already.");
                        break;
                    } else {
                        word5 = wordList[4];
                        score += 15;
                        correct++;
                        break;
                    }
                case ("union"):
                case ("unions"):
                    if (word6 != "?") {
                        System.out.println("You have answered this question already.");
                        break;
                    } else {
                        word6 = wordList[5];
                        score += 5;
                        correct++;
                        break;
                    }
                default:
                    crosses++;
                    break;
            }
        }
        if (crosses < 3) {
            System.out.println("Congratulations! You completed this level!");
        } else {
            System.out.println("Better luck next time!");
        }

        System.out.println("Thank you for playing, " + name);
        System.out.println("Score: " + score);

        userInput.close();
    }
}