import java.util.Arrays;

public class InsertionSortTest {

  public static void main( String[] args ) {
    int [] sortedArrayASC  = { 1, 2, 3, 4, 5, 6, 7 };
    int [] sortedArrayDESC = { 7, 6, 5, 4, 3, 2, 1 };
    int [] unsortedArray   = { 2, 7, 4, 1, 5, 3, 6 };

    test (
      "InsertionSort.sort, when no sort order given",
      sortedArrayASC,
      InsertionSort.sort( unsortedArray )
    );

    test (
      "InsertionSort.sort, when ascending order given",
      sortedArrayASC,
      InsertionSort.sort( unsortedArray, InsertionSort.Order.ASC )
    );

    test (
      "InsertionSort.sort, when descending order given",
      sortedArrayDESC,
      InsertionSort.sort( unsortedArray, InsertionSort.Order.DESC )
    );
  }

  static final String ANSI_RED = "\u001B[31m";
  static final String ANSI_RESET = "\u001B[0m";

  static void test( String testName, int[] expected, int[] actual) {
    double startTime = System.nanoTime();
    boolean result = Arrays.equals(expected, actual);
    double endTime = System.nanoTime();
    double durationInMicroseconds = (endTime - startTime) / 1000;

    if (result) {
      System.out.println(testName);
      System.out.println("PASS: (" + durationInMicroseconds + " μs)");
    } else {
      System.out.println(ANSI_RED + testName + ANSI_RESET);
      System.out.println(ANSI_RED + "Expected: " + Arrays.toString(expected) + ANSI_RESET);
      System.out.println(ANSI_RED + "Actual:   " + Arrays.toString(actual) + ANSI_RESET);
      System.out.println(ANSI_RED + "FAIL: (" + durationInMicroseconds + " μs)"  + ANSI_RESET);
    }
    System.out.println("----------------------------------");
  }
}
