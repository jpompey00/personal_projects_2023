package julian.projects;
import java.util.Scanner;

public class CLI {

    //object declaration for CLI
    String_Reversal sr = new String_Reversal();
    Scanner s = new Scanner(System.in);

    //the script that the main will interact with
    public void commandLineInterface(){
        //TODO fix
        System.out.println("Input an Option");
        //TODO try catch to make sure they can't input a non int
        String input = s.nextLine();
        CLIScript(Integer.parseInt(input));
    }

    public void CLIScript(int option){

        if(option == 1){
            System.out.println("Enter the word to reverse");
            String input = s.nextLine();
            System.out.println(sr.reversedString(input));

        }
    }




}
