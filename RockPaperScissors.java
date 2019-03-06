/* 
_______
---'   ____)
(_____)
(_____)                                                       
(____)
---.__(___)

R)rrrrr   O)oooo    C)ccc  K)   kk  
R)    rr O)    oo  C)   cc K)  kk   
R)  rrr  O)    oo C)       K)kkk    
R) rr    O)    oo C)       K)  kk   
R)   rr  O)    oo  C)   cc K)   kk  
R)    rr  O)oooo    C)ccc  K)    kk 

                                                                
_______                                                         
---'   ____)____                                          
______)                                             
_______)
_______)             
---.__________)               

                                     
P)ppppp    A)aa   P)ppppp  E)eeeeee R)rrrrr  
P)    pp  A)  aa  P)    pp E)       R)    rr 
P)ppppp  A)    aa P)ppppp  E)eeeee  R)  rrr  
P)       A)aaaaaa P)       E)       R) rr    
P)       A)    aa P)       E)       R)   rr  
P)       A)    aa P)       E)eeeeee R)    rr 


_______
---'   ____)____
______)
__________)
(____)
---.__(___)

S)ssss    C)ccc  I)iiii  S)ssss   S)ssss   O)oooo  R)rrrrr   S)ssss  
S)    ss  C)   cc   I)   S)    ss S)    ss O)    oo R)    rr S)    ss 
S)ss    C)         I)    S)ss     S)ss    O)    oo R)  rrr   S)ss    
S)  C)         I)        S)       S)  O)    oo R) rr         S)  
S)    ss  C)   cc   I)   S)    ss S)    ss O)    oo R)   rr  S)    ss 
S)ssss    C)ccc  I)iiii  S)ssss   S)ssss   O)oooo  R)    rr  S)ssss  
 */
import java.util.*;
public class RockPaperScissors
{
    public static void RockPaperScissors()
    {
        Random rand = new Random();
        //Set input to the scanner used later to gather input
        Scanner input = new Scanner(System.in);
        boolean gameContinue = false;
        int num = 0;
        String playerOne;
        String playerTwo;
        String continuePlaying;
        //Added two types of gamemodes to give the game variety
        System.out.println("Computer or two player?");
        String gameVersion = input.nextLine();
        //Big if statement used to change between gamemodes
        //Allows the game not to crash when user types different names for the modes
        if (gameVersion.equals("Computer")||gameVersion.equals("C")||gameVersion.equals("computer")||gameVersion.equals("Comp")){
            do{
                //gameContinue is a boolean variable that handles if the user wants to continue playing later
                gameContinue = false;
                //num is an int variable that chooses a random number between 1 and 3. If 1: Computer = Rock, If 2: Computer = Paper, If 3: Computer = Scissors
                num = rand.nextInt(3) + 1;
                System.out.println("Rock, Paper or Scissors");
                String userInput = input.nextLine();
                //Each if statement shows the different situations that can occur
                if (userInput.equals("Rock") || userInput.equals("r") || userInput.equals("rock"))
                {
                    if (num == 1){System.out.println("Player: Rock | Computer: Rock");System.out.println("It's a tie!");}
                    else if (num == 2){System.out.println("Player: Rock | Computer: Paper");System.out.println("Computer Wins!");}
                    else {System.out.println("Player: Rock | Computer: Scissors");;System.out.println("Player Wins!");}
                }
                else if (userInput.equals("Paper") || userInput.equals("paper") || userInput.equals("p")){
                    if (num == 1){System.out.println("Player: Paper | Computer: Rock");System.out.println("Player Wins!");}
                    else if(num == 2){System.out.println("Player: Paper | Computer: Paper");System.out.println("It's a tie!");}
                    else {System.out.println("Player: Paper | Computer: Scissors");System.out.println("Computer Wins!");}
                }
                else {
                    if (num == 1){System.out.println("Player: Scissors | Computer: Rock");System.out.println("Computer Wins!");}
                    else if(num == 2){System.out.println("Player: Scissors | Computer: Paper");System.out.println("Player Wins!");}
                    else {System.out.println("Player: Scissors | Computer: Scissors");System.out.println("It's a tie!");}
                }
                //This is where the program askes the user if he wants to continue
                System.out.println("Do you want to keep playing?");
                continuePlaying = input.nextLine();
                //If the user does, gameContinue becomes true and it loops back to the beginning
                if (continuePlaying.equals("Yes") && continuePlaying.equals("y")){gameContinue = true;}
                //If it doesnt then it breaks the loop
                else{break;}
            }while(gameContinue = true);
        }
        else { //use else to play the second gamemode
            do{
                gameContinue = false;
                System.out.println("Player one type Rock, Paper or Scissors"); //This is a prompt to get player 1 answer
                playerOne = input.nextLine();
                System.out.println("Player two type Rock, Paper or Scissors"); //This is a prompt to get player 2 answer
                playerTwo = input.nextLine();
                if (playerOne.equals(playerTwo)) {System.out.println("Its a tie");}
                else if (playerOne.equals("Rock") && playerTwo.equals("Paper")) {System.out.println("Player Two wins");} 
                else if (playerOne.equals("Paper") && playerTwo.equals("Rock")) {System.out.println("Player One wins");}
                else if (playerOne.equals("Paper") && playerTwo.equals("Scissors")) {System.out.println("Player Two wins");}     //This whole group of if statements
                else if (playerOne.equals("Scissors") && playerTwo.equals("Paper")) {System.out.println("Player One wins");}     //It goes through the different senerios
                else if (playerOne.equals("Rock") && playerTwo.equals("Scissors")) {System.out.println("Player One wins");}
                else if (playerOne.equals("Scissors") && playerTwo.equals("Rock")) {System.out.println("Player Two wins");}
                System.out.println("Do you want to keep playing?");
                continuePlaying = input.nextLine();
                if (continuePlaying.equals ("Yes") && continuePlaying.equals("y")){gameContinue = true;} //This is just like the restart functio earl
                else {break;}
            }while(gameContinue = true);
        }    
    }
}
