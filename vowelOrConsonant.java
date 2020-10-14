import java.util.Scanner;

public class vowelOrConsonant {
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char answer = input.next().charAt(0);
   

    if((answer >= 'a' && answer <= 'z') || (answer >= 'A' && answer <= 'Z')) {

      if(answer == 'A' || answer == 'a' || answer == 'I' || answer == 'i'|| answer == 'U' || answer == 'u' || answer == 'E' || answer == 'e' || answer == 'O' || answer == 'o') {
        System.out.println(answer + " is a vowel"); 
        
      } else {
        System.out.println(answer + " is a consonant");
      }
    } else {
      System.out.println(answer + " is an invalid input");
    }

  }
} 