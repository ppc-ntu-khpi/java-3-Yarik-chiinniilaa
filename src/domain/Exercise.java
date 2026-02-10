package domain;

public class Exercise {
    public static int Calculate(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Масив повинен містити принаймні два елементи");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
                foundSecond = true;
            } else if (num > secondMax && num != max) {
                secondMax = num;
                foundSecond = true;
            }
        }

        if (!foundSecond || secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("У масиві немає другого за величиною унікального числа");
        }

        return secondMax;
    }
}