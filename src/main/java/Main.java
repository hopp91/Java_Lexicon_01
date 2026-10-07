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


        // Excercise 3

        // Item 1
        String item1Name ="Apple";
                int item1quantity = 2;
                        double item1price = 15.00;
        // Item 2
        String item2Name = "Milk";
                int item2quantity = 1;
                        double item2price = 22.50;
        // Item 3
        String item3Name = "Bread";
                int item3quantity = 3;
                        double item3price = 18.00;

        double item1total = item1quantity * item1price;
        double item2total = item2quantity * item2price;
        double item3total = item3quantity * item3price;

        double grandTotal = item1total + item2total + item3total;

        // Print

        IO.println("-- Receipt --");
        IO.println(item1Name + " " + item1quantity + " x " + item1price + " = " + item1total + " SEK");
        IO.println(item2Name + " " + item2quantity + " x " + item2price + " = " + item2total + " SEK");
        IO.println(item3Name + " " + item3quantity + " x " + item3price + " = " + item3total + " SEK");
        IO.println("Grand Total: " + grandTotal);


        // Excercise 4



    }
}



