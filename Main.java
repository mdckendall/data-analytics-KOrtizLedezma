import java.util.Scanner;

class Main {
	public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    int option = 0;
    boolean state = false;
    
    while(!state){
      menu.mainMenu();//Displays the main Menu
      option = input.nextInt();
      input.nextLine();
      switch(option){
      case 1:
        menu.caseOne();
        break;
      case 2:
        menu.caseTwo();
        break;
      case 3:
        menu.caseThree();
        break;
      case 4:
        menu.caseFour();
        break;
      case 5:
        state = true;
        break;
      default:
        menu.caseDefault();
        break;
    }
    } 
	}
}