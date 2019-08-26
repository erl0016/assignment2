/*Author:       Eric LaPorte (erl0016)
* Course:       COMP 3700 (Software Modeling and Design)
* Professor:    Dr. Tung Nguyen
* Date:         28 August 2019
* */

// Simple java class that searches for the maximum and minimum int values in an int array.
public class Finder {

    // Searches a given int array for the largest int value and returns it.
    public int findMax(int[] intArray) {
        int max = 0;
        if (intArray == null || intArray.length < 1) {
            return Integer.parseInt(null);
        }
        else {
            for (int i = 0; i < intArray.length; i++) {
                if (max < intArray[i]) {
                    max = intArray[i];
                }
            }
        }
        return max;
    }

    // Searches a given int array for the smallest int value and returns it.
    public int findMin(int[] intArray) {
        int min = 0;
        if (intArray == null || intArray.length < 1) {
            return Integer.parseInt(null);
        }
        else {
            for (int i = 0; i < intArray.length; i++) {
                if (min > intArray[i]) {
                    min = intArray[i];
                }
            }
        }
        return min;
    }
}
