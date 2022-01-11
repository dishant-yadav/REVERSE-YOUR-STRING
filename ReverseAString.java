import java.util.Scanner;

public class ReverseAString { 
    public static void main(String[] args) { // defining the main method

        Scanner input = new Scanner(System.in); // creating an object of the scanner class

        System.out.print("ENTER THE STRING THAT NEEDS TO REVERSED : "); 
        String string = input.nextLine(); // statement to take string as an input

        System.out.println("REVERSED STRING : " + reverseString(string)); // reveresed string

        input.close(); // closing the object input of the scanner class 
    } 

    static String reverseString(String string) { // defining the reverseString method to reverse the string

        String reversedString = ""; // an empty string variable to store the reverse string character by character

        if (string.length() == 1) // checking if the string is of length 1 
            return string; // returning the string itself

        for (int indexOfString = string.length() - 1; indexOfString >= 0; indexOfString--) { // tranversing the string in a reverse manner
            reversedString = reversedString + string.charAt(indexOfString); // adding character(beginning from the end) to a empty string variable  
        }

        return reversedString; // returning the reversed array

    } // closing the reverseString method

}