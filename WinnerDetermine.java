import java.util.*;
import java.util.Random;
public class WinnerDetermine {
  public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

    System.out.println("This is a test for determining a higher score.");
    System.out.println("Pick any number between 1-10");
        int userNumber = sc.nextInt();
    
    int select = random.nextInt(arr.length);
    System.out.println("The system chose" + " " + arr[select]);

    if(userNumber > select){
        System.out.println("You win! Your number was higher than the system's");
    }else if(userNumber < select){
        System.out.println("Unfortunately....you lost this time...Maybe try again?");
    }else if(userNumber == select){
        System.out.println("Draw! Both numbers were the same.");
    }else{
        System.out.println("Error...");
    }

  }  
}
