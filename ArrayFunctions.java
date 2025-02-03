// Name: Dhaerya More
// PRN:  23070126033
// Batch: AIML A2

import java.util.*;

class ArrayFunctions {
    void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }

        display(even);
        display(odd);
    }

    int findSmallestDistancePair(int[] array) {
        if (array.length < 2) return -1; // Not enough elements

        int minIndex = 0;
        int minDistance = Math.abs(array[1] - array[0]);

        for (int i = 1; i < array.length - 1; i++) {
            int distance = Math.abs(array[i + 1] - array[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }

    void convertArrayAndList(int[] array) {
        // Convert array to ArrayList using a traditional for loop
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println("Converted ArrayList: " + list);

        // Convert ArrayList back to array using a traditional for loop
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        System.out.println("Converted back to array: " + Arrays.toString(newArray));
    }
}
