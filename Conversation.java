import java.util.Scanner;
class Conversation {

  public static void main(String[] arguments) {
    // This takes in user input.
    Scanner input = new Scanner(System.in);
    input.useDelimiter(System.getProperty("line.separator"));


    //Greets the user and asks for an int input.
    System.out.println("Hi there! What's your name?");
    String name = input.next();
    System.out.println("Hello " + name +"!");

    System.out.print("How many rounds of conversation would you like," + name + " ?");
    int user_Round_Number = input.nextInt();

    
    
    //Loop determines how many rounds of conversation will occur based on user input to user_Round_Number
    for (int i = 0; i <= user_Round_Number; i++) {
      if (user_Round_Number == 0) {
            System.out.println("Okay, bye.");

      } else {
            System.out.println("Ok, let's start! What's in your mind today?");
            break;

      }
    }






    //Conversation begins
    for (int i = 0; i < user_Round_Number; i++){
      String user_response = input.next();
      System.out.println("Aja");

    


    }

    //* I -> you 
    // * me -> you
    // * am -> are
    // * you -> I
    // * my -> your
    // * your -> my

    






    
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




















    





    //variable for conversation transcript
    char transcript[];
    
}
}

