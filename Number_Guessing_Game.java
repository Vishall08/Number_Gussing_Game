import java.util.Scanner;

public class Number_Guessing_Game{
    
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);

        int num = 1+(int)(100*Math.random());
        int k=5,i,guess;
        System.out.println("A number is chosen"+"between 1 to 100."+"within 5 trials.");
        for(i=0;i<k;i++){
            System.out.println("Guess the number: ");
            guess = sc.nextInt();

            if(num == guess){
                System.out.println("Congratulations! "+"You guessed the number.");
                break;
            }
            else if(num>guess && i!=k-1){
                System.out.println("The number is "+"greater than" +guess);
            }
            else if(num<guess && i!=k-1){
                System.out.println("The number is "+"less than"+guess);
            }
        }
        if(i==k){
            System.out.println("You have exhausted "+"K trials.");
            System.out.println("The number was"+ num);
        }


    }
    public static void main(String[] args) {
        guessingNumberGame();
    }
}
