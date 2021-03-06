import java.util.Arrays;

public class MergeSortTest {

  public static void main( String[] args ) {
    int[] unsortedArray      = { 3, 5, 8, 1, 6, 2, 9, 9, 0 };
    int[] sortedArray        = { 0, 1, 2, 3, 5, 6, 8, 9, 9 };
    int[] reverseSortedArray = { 9, 9, 8, 6, 5, 3, 2, 1, 0 };
    int[] smallArray1 = {1};
    int[] smallArray2 = {2};
    int[] resultAsc = {1, 2};
    int[] resultDesc = {2, 1};

    test(
      "MergeSort.mergeAsc",
      resultAsc,
      MergeSort.mergeAsc(smallArray1, smallArray2)
    );

    test(
      "MergeSort.mergeDesc",
      resultDesc,
      MergeSort.mergeDesc(smallArray1, smallArray2)
    );

    test(
      "MergeSort.sort, with no options",
      sortedArray,
      MergeSort.sort( unsortedArray )
    );

    test(
      "MergeSort.sort, ascending",
      sortedArray,
      MergeSort.sort( unsortedArray, MergeSort.Order.ASC )
    );

    test(
      "MergeSort.sort, descending",
      reverseSortedArray,
      MergeSort.sort( unsortedArray, MergeSort.Order.DESC )
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
