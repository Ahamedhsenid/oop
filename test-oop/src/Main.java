import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;


        while (true) {
            System.out.println("Select a shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Enter side length of Square");
                        double side = scanner.nextDouble();
                        shape = new Square(side);
                        break;
                    case 2:
                        System.out.println("Enter height of rectangle");
                        double height = scanner.nextDouble();
                        System.out.println("enter width of rectangle");
                        double width = scanner.nextDouble();
                        shape = new Rectangle(height, width);
                        break;
                    case 3:
                        System.out.println("enter the radius of circle");
                        double radius = scanner.nextDouble();
                        shape = new Circle(radius);
                        break;
                    case 4:
                        System.out.println("\nCalculation closed, Thank you! ");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }
                printShapeDetails(shape);



            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }


        }
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("\nProperties");
        shape.printProperties();
        System.out.println("\nArea = " + shape.getArea());
        System.out.println("Perimeter = " + shape.getPerimeter() + "\n");
    }

}
