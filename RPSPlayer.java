import java.util.Random;
import java.util.Scanner;
class RPSPlayer implements Player
{
    

    
    public RPSPlayer()
    {
        //Determine on your own
    }
    
     /**
     * If cpu = true, randomly generate
     * If cpu = false, ask user for input
     */
    public String pick(boolean cpu) {
        Random scan= new Random();
        Scanner rand = new Scanner(System.in);
        String output = "";
        //1 is rock
        //2 is paper
        //3 is scissors
        if(cpu = true){
            output = (interpretNumber(rand.nextInt((4-1) + 1)));
        }
        return null;
    }
    
    public String interpretNumber(int n){
        if(n == 1){
            return "rock";
        }
        if(n == 2){
            return "paper";
        }
    
        else{
            return "scissors";
        }
    }
    
    public void setName(String n) {
        
    }

    
}
