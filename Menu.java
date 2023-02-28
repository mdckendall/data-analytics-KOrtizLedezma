import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Menu{
  public void mainMenu(){
    System.out.println("Press 1 to learn about the salary.");
    System.out.println("Press 2 to learn about the job.");
    System.out.println("Press 3 to learn about the demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
  }
  public void caseOne(){
    System.out.println("$98,345 average salary in South Florida!");
  }
  public void caseTwo(){
    System.out.println("US News - 100 Best Jobs!");
  }
  public void caseThree(){
    System.out.println("Top 10 Forbes In-Demand Jobs!");
  }
  public void caseFour(){
    try{
      FileReader fr = new FileReader("names.txt");
		  Scanner fileScanner = new Scanner(fr);
      System.out.println("Current Students:");
      while(fileScanner.hasNextLine()){
        String current = fileScanner.nextLine();
        System.out.println(current);
      }
    }   
    catch(FileNotFoundException ex){
      System.out.println("There seems to be an exception...");
    }
		
  }
  public void caseDefault(){
    System.out.println("That option is not valide, try again");
  }
  public void options(int option){
    switch(option){
      case 1:
        caseOne();
        break;
      case 2:
        caseTwo();
        break;
      case 3:
        caseThree();
        break;
      case 4:
        caseFour();
        break;
      case 5:
        System.exit(0);
        break;
      default:
        caseDefault();
        break;
    }
  }
}