/*
- Conversation.java
- Lily Z. G, Juniper H. Lesly H. Priscilla T.
- A Java file that contains the class Conversation and its required methods. The program carries on a simple back-and-forth conversation with the user. It first asks the user to choose a number of rounds of conversation. Then it takes turns printing messages to the user and accepting responses until the specified number of rounds are complete. Finally, it ends the conversation by saying bye and then printing a transcript of the entire conversation for the user.
 */

import java.util.*;
//imports every method from java.util, including Scanner and Array

/*The Conversation class contains all methods that the chatbot will use to talk to the user. 
Conversation class will identify and change words such as "you" to "I", to create more flow within the conversation. 
The class also has loops to determine how many conversation rounds a user would like to have, and conditionals within those loops to determine a response based on the user respons. It also provides a fixed responses that are provided when the user input doesn't include words that must be mirrored by the chatbot. 
A transcript at the end of the conversation is also included.*/
class Conversation {
  public static void main(String[] arguments) 
  {
    List <String> transcript = new ArrayList<>(); //this will create an array list for the conversation transcript

    Scanner nameInput = new Scanner(System.in);
    System.out.println("What's your name?");//prints an initial prompt for the user to answer, does not count toward the conversation round, just a little greeting :)
    transcript.add("What's your name?\n"); //adds the initial prompt to array list for transcript
    
    String name = nameInput.next();
    System.out.println("Hello " + name +"!"); //prints the greeting to the user
    transcript.add("Hello " + name +"!");//adds the greeting to array list for transcript
    System.out.print("How many rounds of conversation would you like? "); //this prints out a question asking for a user input

    Scanner input = new Scanner(System.in); //this scans the input for the number of desired rounds
    int numRounds = input.nextInt();

    Scanner user_input = new Scanner(System.in); //scans the user input and determines how many conversation rounds there will be
    String answer = input.nextLine();


    System.out.println("Okay, let's start!");
    transcript.add("Okay, let's start! \n ");
    //The conversation between the program and user officially begins

    //Conversation between user and conversation round officially begins here
    System.out.println("How's your day?"); //prints another prompt for the user to answer
    transcript.add("How's your day? \n"); //adds the prompt to array list for transcript


    //these are fixed responses that are automatically used when the user input doesn't include any words that require mirroring
    String[] responses = new String[]{"Uh huh.", "Interesting.", "Oh that's good.", "Ok.", "That's cool.", "You're so funny!"}; //create string of canned responses
    
    //The loop will go on for however many rounds the user inputted, and includes conditional statements to identify specific mirror words
    for (int i = 0; i < numRounds; i++){ 
      String newUserInput = input.nextLine(); //take in user input
      transcript.add(newUserInput + "\n"); //adds user input to array list for conversation transcript

            // The conditional statements will identify mirror words within user input
        if (newUserInput.contains(" you ") || newUserInput.contains("You") || newUserInput.contains("I ") || newUserInput.contains(" I ")|| 
        newUserInput.contains(" me ") || newUserInput.contains("Me ") || newUserInput.contains(" my ") || newUserInput.contains("My ") || 
        newUserInput.contains(" am ") || newUserInput.contains(" are ") || newUserInput.contains(" your ") || newUserInput.contains("Your ") || 
        newUserInput.contains("You're ") || newUserInput.contains(" you're ") || newUserInput.contains("I'm ") || newUserInput.contains(" I'm ")
          ){ //detect if user input conains mirror words
              String [] words = newUserInput.split(" "); //this will "split" the user input into individual words

              /*the loop will loop through the newly split list of words and will identify a mirror word (if present) 
                for every instance it appears in the user input and will mirror it*/
              for (int j =0; j < words.length; j++) { 

                //conditional statements will identify mirror words within the list and change them accordingly to maintain conversation
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
                }else if (words[j].equals("Are")){
                    words[j]= "Am";
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
                } else if (words[j].equals("you?")){
                  words[j]= "I?";
                } else if (words[j].equals("You?")){
                  words[j]= "I?";
                } else if (words[j].equals("I?")){
                  words[j]= "you?";
                }
              }
              
          System.out.println(String.join(" ", words)); //joins mirrored words together to create output, and prints out everything as opposed to just the first word
          transcript.add(String.join(" ", words) + "\n"); //adds the output to transcript
          } else { //if no mirror words are detected, a random fixed response will be printed
          Random rand = new Random();
          int upperbound = 6;
          int random_response = rand.nextInt(upperbound); //outputs a random fixed response from the chatbot
          System.out.println(responses[random_response]); //prints the random fixed response
          transcript.add(responses[random_response] + "\n");
                 } //adds the fixed response to transcript
        }
        System.out.println("Bye" + " " + name + "!"); //prints "Bye!" after all conversation rounds are complete
        transcript.toString(); //converts array list transcript into a string
        System.out.println("\n" + "TRANSCRIPT:" + "\n" + String.join("", transcript) + "Bye" + " " + name + "!"); //prints out the newly converted transcript
  }
} 