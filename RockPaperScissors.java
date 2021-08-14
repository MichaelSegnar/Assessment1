import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
    public static Scanner in = new Scanner(System.in);

	public static void main (String args[])
	{
		String again = "n";
		
		do {
			System.out.println("How many rounds?");
			int rounds = Integer.parseInt(in.nextLine());
			if(rounds > 0 && rounds <= 10)
			{
				game(rounds);
				System.out.println("Thanks for playing!\nWould you like to play again? (y/n)");
				again = in.nextLine();
			}
			else {System.out.println("Sorry, you can't play that many rounds");}
		}while(again.equals("y"));
	}
	
	public static void game(int rounds)
	{
		int wins = 0, losses = 0, draws = 0;
		Random beatMe = new Random();
		String [] choice = {"Rock","Paper","Scissors"};
		String opp,you;

		while(rounds > 0)
		{
			opp = choice[beatMe.nextInt(3)];
			
			System.out.println("Choose your weapon:\n1.Rock\n2.Paper\n3.Scissors");
			int pick = Integer.parseInt(in.nextLine()) - 1;
			if(pick < 0 || pick > 2) {System.out.println("Option not available. Try again.\n");}
			else
			{
				you = choice[pick];
				System.out.println("You chose " + you + ", and the opponet chose " + opp +"!");
				if(you.equals(opp)) {System.out.println("It's a tie!\n"); draws++;}
				else
				{
					boolean v;
					switch(pick)
					{
					case 0:
						v = Rock(opp); break;
					case 1:
						v = Paper(opp); break;
					default://case 2:
						v = Scissors(opp); break;
					}
					
					if(v) {System.out.println("You Win!\n"); wins++;}
					else {System.out.println("You Lose!\n"); losses++;}
				}
				rounds--;
			}
			
		}
		System.out.println("Final results:\nWins: " + wins + "\nLosses: " + losses + "\nDraws: " + draws);
	}
	
	//It felt like putting this in the switch would make it look complicated
	public static boolean Rock(String opp)
	{
		if(opp.equals("Scissors")) {return true;}
		return false;
	}
	public static boolean Paper(String opp)
	{
		if(opp.equals("Rock")) {return true;}
		return false;
	}
	public static boolean Scissors(String opp)
	{
		if(opp.equals("Paper")) {return true;}
		return false;
	}
}
