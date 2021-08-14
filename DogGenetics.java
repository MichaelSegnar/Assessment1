import java.util.Scanner;
import java.util.Random;


public class DogGenetics {

    
    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your dog's name? ");
        String name = in.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + " prestigious background right here. \n");
        System.out.println(name + " is:\n");
        
        int dna = 100;
        int per = randomizer.nextInt(dna);
        System.out.println(per + "% German Shepard");
        dna -= per;
        per = randomizer.nextInt(dna);
        System.out.println(per + "% French Poodle");
        dna -= per;
        per = randomizer.nextInt(dna);
        System.out.println(per + "% Pitbull");
        dna -= per;
        per = randomizer.nextInt(dna);
        System.out.println(per + "% Corgi");
        dna -= per;
        System.out.println(dna + "% Alaskan Husky");
        
        System.out.println("\nWow! That is some dog!");
    }
}
