import java.util.Arrays;

public class BubbleSortTest
{
  public static void main( String[] args )
  {
    int [] sortedArrayASC  = { 1, 2, 3, 4, 5, 6, 7 };
    int [] sortedArrayDESC = { 7, 6, 5, 4, 3, 2, 1 };
    int [] unsortedArray   = { 2, 7, 4, 1, 5, 3, 6 };

    test (
      "BubbleSort.sort, when no sort order given",
      sortedArrayASC,
      BubbleSort.sort( unsortedArray )
    );

    test (
      "BubbleSort.sort, when ascending order given",
      sortedArrayASC,
      BubbleSort.sort( unsortedArray, BubbleSort.Order.ASC )
    );

    test (
      "BubbleSort.sort, when descending order given",
      sortedArrayDESC,
      BubbleSort.sort( unsortedArray, BubbleSort.Order.DESC )
    );
  }

  static void test( String testName, int [] expected, int [] actual)
  {
    System.out.println(testName);
    if (Arrays.equals(expected, actual)) {
      System.out.println("PASS");
    } else {
      System.out.println("Expected: " + Arrays.toString(expected));
      System.out.println("Actual:   " + Arrays.toString(actual));
      System.out.println("FAIL");
    }
    System.out.println("----------------------------------");
  }
}
