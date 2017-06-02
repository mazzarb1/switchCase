/**
 * Created by brandonmazzarella on 6/2/17.
 */

import java.util.Scanner;

public class switchTests {

    public static void main(String[] args){

        int grade, category;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a numberic grade (0-100) : ");
        grade = scan.nextInt();

        category = grade/10;
        System.out.println(category);

        System.out.println("That grade is: ");

        switch (category)
        {
            case 10:
                System.out.println("a perfect score. well done.");
                break;
            case 9:
                System.out.println("well above average.  Excellent.");
                break;
            case 8:
                System.out.println("above average. nice.");
                break;
            case 7:
                System.out.println("average.");
                break;
            case 6:
                System.out.println("below average.  Please see instructor.");
                break;
            default:
                System.out.println("You got below a 60... very bad.");

        }



    }

}
