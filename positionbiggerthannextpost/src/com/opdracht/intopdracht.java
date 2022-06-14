package com.opdracht;

public class intopdracht {
    public static void main(String[] args) {
        int numbers[] = {10, 2, 5, 6, 2};

        int result = outputhigher(numbers);

        System.out.println(result);
    }
    public static int outputhigher(int[] numbers) {
        for (int number = 0; number < numbers.length; number++) {
            if (numbers[number] > numbers[number + 1]) {
                System.out.println(number);
            }
        }
        return 0;
    }
}
