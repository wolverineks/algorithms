import java.util.Arrays;

public class SelectionSortTest {

  public static void main( String[] args ) {
    int[] unsortedArray      = { 3, 5, 8, 1, 6, 2, 9, 9, 0 };
    int[] sortedArray        = { 0, 1, 2, 3, 5, 6, 8, 9, 9 };
    int[] reverseSortedArray = { 9, 9, 8, 6, 5, 3, 2, 1, 0 };
    int[] before = { 1, 2 };
    int[] after = { 2, 1 };

    test(
      "SelectionSort.swap",
      after,
      SelectionSort.swap(before, 0, 1)
    );

    test(
      "SelectionSort.sort, with no options",
      sortedArray,
      SelectionSort.sort( unsortedArray )
    );

    test(
      "SelectionSort.sort, ascending",
      sortedArray,
      SelectionSort.sort( unsortedArray, SelectionSort.Order.ASC )
    );

    test(
      "SelectionSort.sort, descending",
      reverseSortedArray,
      SelectionSort.sort( unsortedArray, SelectionSort.Order.DESC )
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
