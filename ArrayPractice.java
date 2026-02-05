public class ArrayPractice {
    public static void main(String[] args) {

        // ============================================
        // PART 1: INTEGER ARRAYS
        // ============================================

        // TODO 1: Create an array of 5 integers representing test scores
        int[] scores = {90, 85, 78, 92, 88};

        // TODO 2: Print the first score (index 0)
        System.out.println("First score: " + scores[0]);

        // TODO 3: Print the last score (use .length - 1)
        System.out.println("Last score: " + scores[scores.length - 1]);

        // TODO 4: Calculate and print the average of all scores
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.println("Average: " + average);

        // ============================================
        // PART 2: STRING ARRAYS
        // ============================================

        // TODO 5: Create a String array with 3 color names
        String[] colors = {"Red", "Green", "Blue"};

        // TODO 6: Print each color using a for loop
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Color " + i + ": " + colors[i]);
        }

        // ============================================
        // PART 3: PREVIEW - ROCK PAPER SCISSORS
        // ============================================

        // TODO 7: Create an array for Rock-Paper-Scissors choices
        String[] choices = {"Scissor", "Rock", "Paper"};

        // TODO 8–10: Print what each index represents
        System.out.println("Index 0 is: " + choices[0]);
        System.out.println("Index 1 is: " + choices[1]);
        System.out.println("Index 2 is: " + choices[2]);

        System.out.println();
        System.out.println("--- Week 4 Lab Complete! ---");
        System.out.println("You're ready for Assignment 3: Rock-Paper-Scissors");
    }
}
