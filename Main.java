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
      menu.options(option);
    } 
	}
}