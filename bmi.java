//1.1//
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
    }
}
//1.2.//
import java.lang.Math;

public class ProjectileMotion {
    public static void main(String[] args) {
        double initialVelocity = 10.0; // meters per second
        double angle = 30.0; // degrees
        double time = 2.0; // seconds
        double accelerationDueToGravity = 9.8; // meters per second squared

        double radians = Math.toRadians(angle);
        double horizontalVelocity = initialVelocity * Math.cos(radians);
        double verticalVelocity = initialVelocity * Math.sin(radians);

        double horizontalDistance = horizontalVelocity * time;
        double verticalDistance = verticalVelocity * time - 0.5 * accelerationDueToGravity * time * time;

        System.out.println("Horizontal distance: " + horizontalDistance + " meters");
        System.out.println("Vertical distance: " + verticalDistance + " meters");
    }
}