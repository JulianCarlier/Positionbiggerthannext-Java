package com.opdracht;

public class test {
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 1, 5, 4, 9, 8, 7, 5 };

        int result = test(arr);
        System.out.println(result);
    }
    public static int test(int arr[]) {
        for (int i = 1; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                System.out.println(i);
        }
        return 0;
    }
}
