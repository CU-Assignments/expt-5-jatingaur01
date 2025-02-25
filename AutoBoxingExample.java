import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {
    public static void main(String[] args) {
        // Sample list of integer strings
        String[] numberStrings = {"10", "20", "30", "40", "50"};
        
        // Convert string array to list of Integer objects
        List<Integer> numbers = parseStringsToIntegers(numberStrings);
        
        // Calculate sum using autoboxing and unboxing
        int sum = calculateSum(numbers);
        
        // Print the result
        System.out.println("Sum of numbers: " + sum);
    }
    
    // Method to parse an array of strings into a list of Integers
    public static List<Integer> parseStringsToIntegers(String[] strNumbers) {
        List<Integer> integerList = new ArrayList<>();
        for (String str : strNumbers) {
            integerList.add(Integer.parseInt(str)); // Autoboxing
        }
        return integerList;
    }
    
    // Method to calculate the sum of a list of integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }
}
