package no.ntnu.idata2302.lab01;


/**
 * Represents a class that return the minimum of an array.
 *
 * @author Even J.P Haslerud
 * @verion 24.10.2022
 */
public class Minimum {

  /**
   * Checks that the given array is not empty, in which case,
   * the minimum makes no sense. Initializes the minimum with
   * the first value of given array. Then go through each remaining
   * value, updating the minimum when I find one that is smaller than
   * the minimum so far.
   *
   * @param array Holds on to some elements
   * @return the minimum of the array
   */
  public static int findMinimum(int[] array){
    // Check that the given array is not empty
    if (array.length == 0){
      throw new IllegalArgumentException("There must be at least one item.");
    }
    // Initializes the minimum with the
    // first value of the given array.
    int minimum = array[0];

    // Goes through each remaining value, updating the
    // minimum when I find one that is smaller than the
    // so far
    for(int each = 1; each < array.length; each++){
      if(array[each] < minimum){
        minimum = array[each];
      }
    }
    return minimum;
  }

}
