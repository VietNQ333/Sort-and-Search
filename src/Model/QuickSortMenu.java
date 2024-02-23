package Model;


import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class QuickSortMenu  {


    public void QuickSort() {

            int numElements = getPositiveDecimalInput();
            int[] arrayToSort = generateRandomArray(numElements);

            System.out.println("Unsorted Array: ");
            displayArray(arrayToSort);

            quickSort(arrayToSort, 0, arrayToSort.length - 1);

            System.out.println("Sorted Array (Quick Sort): ");
            displayArray(arrayToSort);
        
    }

    private int getPositiveDecimalInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a positive decimal number: ");
                double num = Double.parseDouble(scanner.nextLine());
                if (num >= 0 && num % 1 == 0) {  // Kiểm tra là số nguyên dương
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

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
