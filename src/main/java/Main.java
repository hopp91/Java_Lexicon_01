import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Excercise 1

        IO.println("My Profile");
        String name = "Jesper";
        int age = 35;
        String city = "Växjö";

        IO.println("Name: " + name);
        IO.println("Age: " + age);
        IO.println("City: " + city);


        // Excercise 2

        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            IO.println("It is a leap year.");
        } else {
            IO.println("It is not a leap year.");
        }

        scanner.close();


        // Excersice 3




    }
}



