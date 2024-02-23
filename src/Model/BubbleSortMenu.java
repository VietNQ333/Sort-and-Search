package Model;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortMenu  {


    public void BubbleSort() {
            int numElements = getPositiveDecimalInput();
            int[] arrayToSort = generateRandomArray(numElements);

            System.out.println("Unsorted Array: ");
            displayArray(arrayToSort);

            bubbleSort(arrayToSort);

            System.out.println("Sorted Array (Bubble Sort): ");
            displayArray(arrayToSort);
        
    }

    private int getPositiveDecimalInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a positive decimal number: ");
                double num = Double.parseDouble(scanner.nextLine());
                if (num >= 0) {
                    return (int) num;
                } else {
                    System.out.println("Please enter a positive decimal number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive decimal number.");
            }
        }
    }

    private int[] generateRandomArray(int numElements) {
        Random random = new Random();
        int[] array = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(10); // Generate random integer in the range [0, 100)
        }
        return array;
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap the elements
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

