import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Assigning scores to variables
        int math,physics,turkısh,chemistry,history,music;

        Scanner imp = new Scanner(System.in);

        //Get user inputs
        System.out.println("Enter Math score : ");
        math = imp.nextInt();

        System.out.println("Enter physics score : ");
        physics = imp.nextInt();

        System.out.println("Enter turkısh score : ");
        turkısh = imp.nextInt();

        System.out.println("Enter chemistry score : ");
        chemistry = imp.nextInt();

        System.out.println("Enter history score : ");
        history = imp.nextInt();

        System.out.println("Enter music score : ");
        music = imp.nextInt();

        int totalScore = (math + physics + turkısh + chemistry + history + music);
        double average = (double) totalScore / 6;
        System.out.println("Average Score: " + average);

        if (average > 60 )
            System.out.println("Passed");
         else
            System.out.println("Fail");

    }
}

