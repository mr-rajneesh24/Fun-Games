import java.util.Scanner;
import java.util.Random;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock..,1 for paper..,and 2 for scissor");
        int userinput = sc.nextInt();
        
        Random ra = new Random();
        int computerinput=ra.nextInt(3);
        
        if(computerinput==userinput)
        {
            System.out.println("draw");
        }
        else if(computerinput==0&&userinput==1 || computerinput==1&&userinput==2 || computerinput==2&&userinput==0)
        {
            System.out.println("You won !");
        }
        else{
            System.out.println("You loose !!...Try again");
        }
        System.out.println("Computer uses the number: "+ computerinput);
    }
}