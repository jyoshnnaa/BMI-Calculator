import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the user's weight and height
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        sc.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

