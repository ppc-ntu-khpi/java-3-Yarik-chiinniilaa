package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 12, 20}; 

        try {
            int result = Exercise.Calculate(numbers);
            System.out.println("Масив: " + Arrays.toString(numbers));
            System.out.println("Друге за величиною число у масиві: " + result);
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}