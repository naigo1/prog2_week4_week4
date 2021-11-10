
public class Main {
    public static void main(String[] args){
     System.out.println("main method runs");
     ChatBot bot1 = new ChatBot("bot1");
     ChatBot bot2 = new ChatBot("bot2");
     bot1.greeting();
     bot2.greeting();
     bot2.name = "りんな";
     bot2.greeting();
     
 }
}