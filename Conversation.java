import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    // Sample of input and output
    //loop for amount of "rounds"
    
    Scanner input = new Scanner(System.in);
    input.useDelimiter(System.getProperty("line.separator"));

  // int roundsNumber = 0;
    System.out.print("How many rounds of conversation would you like?");
    int user_Round_Number = input.nextInt();

    //make a for loop that breaks when you input valid number REMINDER TO LOOK UP HOW TO BREAK LOOPS
    for (int i = 0; i <= user_Round_Number; i++) {
      if (user_Round_Number == 0) {
            System.out.println("Okay, bye.");
            
            // How do I ask for input again and store it in the same variable? It gives me the "double variable" error
            //call main agan - recursion
              

      } else {
            System.out.println("Ok, let's start! What's in your mind today?");
            break;

      }
    }

    //* I -> you 
    // * me -> you
    // * am -> are
    // * you -> I
    // * my -> your
    // * your -> my

      // String user_response = input.next();
      // System.out.println("Aja");






    System.out.println("Hi there! What's your name?");
    String name = input.next();
    System.out.println("Hello " + name +"!");
    System.out.println("What would you like to talk about?");


    String convoStarter = input.next();
    if (convoStarter.contains("you")){
      String chatResponse = convoStarter.replace("you", "I");

    
      
      System.out.println(chatResponse);
    };

    // if (convoStarter.contains(s:"I")){
    //   String
    // }
    
    // System.out.println(convoStarter);
    input.close();
    
}
}