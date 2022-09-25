import java.util.*;

class Conversation {
  public static void main(String[] arguments) 
  {
    List <String> transcript = new ArrayList<>(); //this will create an array list for the conversation transcript
    System.out.print("How many rounds of conversation would you like? "); //prints out a question asking for a user input
    Scanner input = new Scanner(System.in); //scans the input for the number of desired rounds
    int numRounds = input.nextInt();

    Scanner user_input = new Scanner(System.in); //scans the user input and determines how many rounds there will be
    String answer = input.nextLine();

    System.out.println("What's your name?");//prints an initial prompt for the user to answer
    transcript.add("What's your name?\n"); //adds the initial prompt to array list for transcript
    
    String name = input.next();
    System.out.println("Hello " + name +"!"); //prints the greeting to the user
    transcript.add("Hello " + name +"!");//adds the greeting to array list for transcript

    System.out.println("Okay, let's start!");
    transcript.add("Okay, let's start! \n ");

    

    
    System.out.println("How's your day been?"); //prints another prompt for the user to answer
    transcript.add("How's your day been? \n"); //adds the prompt to array list for transcript
    String response = input.next();

    String[] responses = new String[]{"Uh huh.", "Interesting.", "That's good to hear.", "Ok.", "Cool beans.", "That is amusing."}; //create string of canned responses
    

    //The loop will go on for however many rounds the user inputted
    for (int i = 0; i < numRounds; i++){ 
      String newUserInput = input.nextLine(); //take in user input
      transcript.add(newUserInput + "\n"); //add user input to array list for transcript

      // The conditional statements will identify mirror words
        if (newUserInput.contains(" you ") || newUserInput.contains("You") || 
        newUserInput.contains("I ") || newUserInput.contains(" I ")|| 
        newUserInput.contains(" me ") || newUserInput.contains("Me ") || 
        newUserInput.contains(" my ") || newUserInput.contains("My ") || 
        newUserInput.contains(" am ") || newUserInput.contains(" are ") || 
        newUserInput.contains(" your ") || newUserInput.contains("Your ") || 
        newUserInput.contains("You're ") || newUserInput.contains(" you're ") || 
        newUserInput.contains("I'm ") || newUserInput.contains(" I'm ")
          ){ 
              String [] words = newUserInput.split(" "); //this will "split" the user input into individual words
              for (int j =0; j < words.length; j++) { //will identify a mirror word (if present) for every instance it appears in the user input and will mirror it
                if (words[j].equals("I"))
                {
                  words[j]= "you";
                } else if (words[j].equals("you")){
                  words[j]= "I";
                } else if (words[j].equals("You")){
                  words[j]= "I";
                } else if (words[j].equals("me")){
                  words[j]= "you";
                } else if (words[j].equals("Me")){
                  words[j]= "You";
                } else if (words[j].equals("am")){
                  words[j]= "are";
                } else if (words[j].equals("are")){
                  words[j]= "am";
                } else if (words[j].equals("my")){
                  words[j]= "your";
                } else if (words[j].equals("My")){
                  words[j]= "Your";
                }else if (words[j].equals("your")){
                  words[j]= "my";
                } else if (words[j].equals("Your")){
                  words[j]= "My";
                } else if (words[j].equals("You're")){
                  words[j]= "I'm";
                } else if (words[j].equals("I'm")){
                  words[j]= "You're";
                } else if (words[j].equals("you're")){
                  words[j]= "I'm";
                } 
              }
          System.out.println(String.join(" ", words)); //join mirrored words together to create output
          transcript.add(String.join(" ", words) + "\n"); //add output to transcript
          } else { //if no mirror words detected
          Random rand = new Random();
          int upperbound = 6;
          int random_response = rand.nextInt(upperbound); //output a random canned response
          System.out.println(responses[random_response]); //print canned response
          transcript.add(responses[random_response] + "\n");
                 } //add canned response to transcript
        }
      System.out.println("Bye"); //print "Bye" after all rounds are done
      transcript.toString(); //convert array list transcript to string
      System.out.println("\n" + "TRANSCRIPT:" + "\n" + String.join("", transcript) + "Bye"); //print transcript
  }
} 