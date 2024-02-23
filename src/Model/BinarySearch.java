package Model;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    
       public void Binary() {
           Scanner scanner = new Scanner(System.in);
            int numElements = getPositiveDecimalInput();
            int[] arrayToSearch = generateRandomArray(numElements);

            System.out.println("Array to Search: ");
            displayArray(arrayToSearch);
           
            System.out.println("Number of Index: " + binarySearch(arrayToSearch, numElements, numElements, numElements));
        
    }
    
    
    private int getPositiveDecimalInput() {
        while (true) {   
            double num = inputDouble("Enter a positive decimal number: ");
                if (num >= 0) {
                    return (int) num;
                } else {
                    System.out.println("Please enter a positive decimal number.");
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
    
    public Double inputDouble(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        while (true) {
            double rs = sc.nextDouble();
            if (rs < 0) {
                System.out.println("Invalid type. Please enter again!!");
                continue;
            }
            return rs;
        }
    }
    public int binarySearch(int[] arr, int number,int high, int low){
        while(low <= high){
            int middle = (low + high)/2;
            if(number == arr[middle]){
                return middle;
            }
            if(number > arr[middle]){
                low = middle + 1;
            }else if(number < arr[middle]){
                high = middle - 1;
            }
        }
        return -1;
    }

    
     
    private void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}

