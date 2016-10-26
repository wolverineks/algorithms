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

  static void test( String testName, int [] expected, int [] actual)
  {

    System.out.println(testName);

    double startTime = System.nanoTime();
    boolean result = Arrays.equals(expected, actual);
    double endTime = System.nanoTime();
    double durationInMicroseconds = (endTime - startTime) / 1000;

    if (result) {
      System.out.println("PASS: (" + durationInMicroseconds + " μs)");
    } else {
      System.out.println("Expected: " + Arrays.toString(expected));
      System.out.println("Actual:   " + Arrays.toString(actual));
      System.out.println("FAIL: (" + durationInMicroseconds + " μs)");
    }
    System.out.println("----------------------------------");
  }
}
