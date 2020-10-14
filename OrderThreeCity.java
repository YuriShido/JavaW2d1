import java.util.Scanner;
import java.util.Arrays;

public class OrderThreeCity {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first city: ");
    String firstCity = input.next();
    System.out.print("Enter the second city: ");
    String secondCity = input.next();
    System.out.print("Enter the third city: ");
    String thirdCity = input.next();

    // String strArray[] = new String[3];
    String[] strArray = {firstCity, secondCity, thirdCity};
    // System.out.println(Arrays.toString(strArray));

    for (int i = 0; i < 3; i++) {
      for(int j = i + 1; j < 3; j++) {
        if(strArray[i].compareTo(strArray[j]) > 0) {
          String temp;
          temp = strArray[i];
          strArray[i] = strArray[j];
          strArray[j] = temp;
        }
      }
    }
    //Sorting the strings
  //   strArray = Stream.of(strArray).sorted().toArray(String[]::new);
  System.out.println("The three cities in alphabetical order are " + Arrays.toString(strArray));
  }


}
//strArray[i].compareTo(strArray[j]) > 0
// String strArray[] = new String[count];
//         Scanner scan2 = new Scanner(System.in);
         
//         //User is entering the strings and they are stored in an array
//         System.out.println("Enter the Strings one by one:");
//         for(int i = 0; i < count; i++)
//         {
//             strArray[i] = scan2.nextLine();
//         }
//         scan.close();
//         scan2.close();
         
//         //Sorting the strings
//         strArray = Stream.of(strArray).sorted().toArray(String[]::new);
         
//         //Displaying the strings after sorting them based on alphabetical order
//         System.out.print("Strings in Sorted Order: " + Arrays.toString(strArray));