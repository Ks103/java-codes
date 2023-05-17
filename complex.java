4.1
class ComplexNumber {
    private double real;
    private double imaginary;
    
    // Default constructor
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }
    
    // Constructor with parameters
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }
    
    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        return new ComplexNumber(realDiff, imaginaryDiff);
    }
    
    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        // Creating complex numbers using constructors
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        
        // Adding two complex numbers
        ComplexNumber sum = num1.add(num2);
        System.out.print("Sum: ");
        sum.display();
        
        // Subtracting two complex numbers
        ComplexNumber diff = num1.subtract(num2);
        System.out.print("Difference: ");
        diff.display();
        
        // Creating an array of complex numbers
        ComplexNumber[] complexArray = new ComplexNumber[3];
        complexArray[0] = new ComplexNumber(4, 5);
        complexArray[1] = new ComplexNumber(3, 2);
        complexArray[2] = new ComplexNumber(6, 1);
        
        // Displaying the complex numbers in the array
        System.out.println("Complex Numbers in Array:");
        for (ComplexNumber num : complexArray) {
            num.display();
        }
    }
}

4.2
public class NumberOperations {
    public int square(int number) {
        return number * number;
    }

    public double cube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();

        int squareResult = operations.square(5);
        System.out.println("Square: " + squareResult);

        double cubeResult = operations.cube(2.5);
        System.out.println("Cube: " + cubeResult);
    }
}
4.3
class Customer {
    private String name;
    private double principal;
    private double rate;

    public Customer(String name, double principal, double rate) {
        this.name = name;
        this.principal = principal;
        this.rate = rate;
    }

    public double computeSimpleInterest() {
        return principal * rate / 100;
    }

    public String getName() {
        return name;
    }
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Customer[] customers = new Customer[10];
        customers[0] = new Customer("John", 10000, 10.00);
        customers[1] = new Customer("Alice", 15000, 10.00);
        customers[2] = new Customer("Bob", 20000, 10.00);
        // Add more customers...

        for (int i = 0; i < customers.length; i++) {
            double interest = customers[i].computeSimpleInterest();
            String customerType = "Normal Citizen";
            if (customers[i].getName().equals("Alice") || customers[i].getName().equals("Bob")) {
                customerType = "Senior Citizen";
            }

            System.out.println("Customer: " + customers[i].getName());
            System.out.println("Customer Type: " + customerType);
            System.out.println("Simple Interest: " + interest);
            System.out.println("-----------------------------");
        }
    }
}