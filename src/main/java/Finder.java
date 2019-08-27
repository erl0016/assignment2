/*Author:       Eric LaPorte (erl0016)
* Course:       COMP 3700 (Software Modeling and Design)
* Professor:    Dr. Tung Nguyen
* Date:         28 August 2019
* */

// Simple java class that searches for the maximum and minimum int values in an int array.
public class Finder {

    // Searches a given int array for the largest int value and returns it.
    public Integer findMax(int[] intArray) {
        Integer max;
        int value = Integer.MIN_VALUE;
        if (intArray == null || intArray.length < 1) {
            return null;
        }
        else {
            for (int i = 0; i < intArray.length; i++) {
                if (value < intArray[i]) {
                    value = intArray[i];
                }
            }
        }
        max = value;
        return max;
    }

    // Searches a given int array for the smallest int value and returns it.
    public Integer findMin(int[] intArray) {
        Integer min;
        int value = Integer.MAX_VALUE;
        if (intArray == null || intArray.length < 1) {
            return null;
        }
        else {
            for (int i = 0; i < intArray.length; i++) {
                if (value > intArray[i]) {
                    value = intArray[i];
                }
            }
        }
        min = value;
        return min;
    }
}
