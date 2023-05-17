3
import java.util.Scanner;

public class Train {
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String journeyDate;
    private int capacity;

    public void initializeVariables(int number, String name, String src, String dest, String date, int cap) {
        trainNumber = number;
        trainName = name;
        source = src;
        destination = dest;
        journeyDate = date;
        capacity = cap;
    }

    public void inputTrainData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter train number: ");
        trainNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter train name: ");
        trainName = input.nextLine();

        System.out.print("Enter source: ");
        source = input.nextLine();

        System.out.print("Enter destination: ");
        destination = input.nextLine();

        System.out.print("Enter journey date: ");
        journeyDate = input.nextLine();

        System.out.print("Enter capacity: ");
        capacity = input.nextInt();
    }

    public void displayData() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Journey Date: " + journeyDate);
        System.out.println("Capacity: " + capacity);
    }

    public static void main(String[] args) {
        Train train = new Train();

        // Using initializeVariables method
        train.initializeVariables(123, "Express Train", "City A", "City B", "2023-05-17", 200);

        // Using inputTrainData method
        // train.inputTrainData();

        train.displayData();
    }
}