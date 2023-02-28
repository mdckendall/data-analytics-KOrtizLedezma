import java.util.Scanner;
import java.util.InputMismatchException;  

class Input{
  public int intValidation(int value){
    Scanner input = new Scanner(System.in);
    boolean state = false;

    while(!state){
      try{
        value = input.nextInt();
        state = true;
      }
      catch(InputMismatchException e){
        System.out.println("Input erropr, try again");
      }
      input.nextLine();
    }
    return value;
  }
}