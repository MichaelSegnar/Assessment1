import java.util.Scanner;

public class HealthyHeart {
    public static void main(String[] args) {

	Scanner inputReader = new Scanner(System.in);
	
	System.out.println("Gimme Age!");
	int a = Integer.parseInt(inputReader.nextLine());
	int b = 220-a;

	System.out.println("Your max heart rate should be " + b + " beats per minute.");
	int low = (int) Math.round(b*0.5);
	int high = (int) Math.round(b*0.85);
	System.out.println("Your target HR Zone is " + low + " - " + high + " beats per minute");
    }
}
