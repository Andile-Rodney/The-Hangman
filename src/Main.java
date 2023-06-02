import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        String[] words = {"b","a","m","b","i"};
        String[] dashes = {"-","-","-","-","-"};

        System.out.println("WELCOME TO THE HANGMAN");
        System.out.println(Arrays.toString(dashes));

        int counter = 0;
        while (! Arrays.equals(words,dashes)&& (counter<words.length+3)) {
            System.out.println("Please guess a letter...");
            userInput = scan.nextLine();

            for (int i = 0; i < words.length; i++) {
                if (words[i].equalsIgnoreCase(userInput)) {
                    dashes[i] = words[i];
                }
            }
            System.out.println(Arrays.toString(dashes));
            counter++;
        }
        if (Arrays.equals(words,dashes)){
            System.out.println("YOU WIN!!!");
        } else System.out.println("YOU HANG!!!!");
        scan.close();
    }

}