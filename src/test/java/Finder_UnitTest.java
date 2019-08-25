/*Author:       Eric LaPorte (erl0016)
 * Course:       COMP 3700 (Software Modeling and Design)
 * Professor:    Dr. Tung Nguyen
 * Date:         28 August 2019
 * */

import org.junit.*;
import static org.junit.Assert.assertEquals;

// Test class for Finder java class.
public class Finder_UnitTest {

    private Finder _finder = new Finder();

    // Tests finding the max value when a valid array is given.
    @Test
    public void findMax_ValidArray() {
        int[] testArray = {5, 0, 12, 8, 2, 15, 7};
        int expected = 15;
        int actual = _finder.findMax(testArray);

        assertEquals(expected, actual);
    }

    // Tests finding the min value when a valid array is given.
    @Test
    public void findMin_ValidArray() {
        int[] testArray = {5, 0, 12, 8, 2, 15, 7};
        int excepted = 0;
        int actual = _finder.findMin(testArray);

        assertEquals(excepted, actual);
    }

    // Tests when a null array is passed.
    @Test
    public void findMax_NullArray() {

    }
}
