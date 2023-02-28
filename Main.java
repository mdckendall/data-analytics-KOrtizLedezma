class Main {
	public static void main(String[] args){

    Menu menu = new Menu();
    Input input = new Input();
    int option = 0;
    boolean state = false;
    while(!state){
      menu.mainMenu();//Displays the main Menu
      option = input.intValidation(option);//Verify the number we are getting is a number
      menu.actions(option);
    } 
	}
}