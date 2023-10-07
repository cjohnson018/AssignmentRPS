import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean donePlaying = false;
        boolean doneMoveA = false;
        boolean doneMoveB = false;
        String playerA = "";//[RPS]
        String playerB = "";//[RPS]
        String playAgain ="";//[Y/N]

        do
        {
            do
            {
                System.out.print("Enter your move Player A [R,P,S]: ");
                playerA=in.nextLine();

                if(playerA.equalsIgnoreCase("R") ||
                    playerA.equalsIgnoreCase("P")||
                    playerA.equalsIgnoreCase("S"))
                {
                    playerA = playerA.toUpperCase();
                    doneMoveA=true;
                }
                else
                    System.out.println("Must be R,P, or S");
            }while(!doneMoveA);
            do
            {
                System.out.print("Enter your move Player B [R,P,S]: ");
                playerB=in.nextLine();

                if(playerB.equalsIgnoreCase("R") ||
                        playerB.equalsIgnoreCase("P")||
                        playerB.equalsIgnoreCase("S"))
                {
                    playerB=playerB.toUpperCase();
                    doneMoveB=true;
                }
                else
                    System.out.println("Must be R,P, or S");
            }while(!doneMoveB);

            //resolution matrix
            if(playerA.equals("R"))
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock: its a Tie!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Paper covers Rock: Player B Wins!");
                }
                else //Player B is S
                {
                    System.out.println("Rock breaks Scissors: Player A Wins!");
                }
            }else if(playerA.equals("P"))
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Paper covers rock: Player A Wins!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Paper vs Paper: its a Tie!");
                }
                else //Player B is S
                {
                    System.out.println("Scissors cuts Paper: Player B Wins!");
                }
            }else //playerA must be S
            {
                if(playerB.equals("R"))
                {
                    System.out.println("Rock breaks Scissors: Player B Wins!");
                }
                else if(playerB.equals("P"))
                {
                    System.out.println("Scissors cuts Paper: Player A Wins!");
                }
                else //Player B is S
                {
                    System.out.println("Scissors vs Scissors: its a Tie!");
                }
            }
            System.out.println("Do you want to keep playing? Y/N: ");
            playAgain = in.nextLine();
            if(playAgain.equalsIgnoreCase("N"))
                donePlaying=true;

        }while(!donePlaying);
    }
}