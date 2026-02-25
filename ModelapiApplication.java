import java.util.*;

public class ModelapiApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Model is running successfully!");
        System.out.println("Enter numbers separated by space:");

        String inputLine = scanner.nextLine();
        String[] numbers = inputLine.split(" ");

        double sum = 0;

        for (String num : numbers) {
            sum += Double.parseDouble(num);
        }

        String prediction;

        if (sum > 10) {
            prediction = "Positive";
        } else {
            prediction = "Negative";
        }

        System.out.println("Total: " + sum);
        System.out.println("Prediction: " + prediction);

        scanner.close();
    }
}