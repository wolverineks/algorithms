public class BinarySearchTest
{
  public static void main( String[] args )
  {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arrayWithDuplicates = { 2, 4, 10, 10, 10, 18 };
    int[] shortArray = { 10 };
    int[] arrayWithRotations = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
    int[] rotatedArrayWithDuplicates = { 5, 6, 6, 7, 8, 9, 1, 1, 3, 3, 3, 3, 4 };

    test (
      "BinarySearch.search, with element present",
      0,
      BinarySearch.search( array, 1 )
    );

    test (
      "BinarySearch.search, with element present",
      3,
      BinarySearch.search( array, 4 )
    );

    test (
      "BinarySearch.search, with element present",
      6,
      BinarySearch.search( array, 7 )
    );

    test (
      "BinarySearch.search, with element present",
      8,
      BinarySearch.search( array, 9 )
    );

    test (
      "BinarySearch.search, with element not present",
      -1,
      BinarySearch.search( array, 10 )
    );

    test (
      "BinarySearch.search_for, first instance, with element present",
      2,
      BinarySearch.search_for( arrayWithDuplicates, 10 , BinarySearch.Instance.FIRST )
    );

    test (
      "BinarySearch.search_for, first instance with element not present",
      -1,
      BinarySearch.search_for( arrayWithDuplicates, 11 , BinarySearch.Instance.FIRST )
    );

    test (
      "BinarySearch.search_for, last instance, with element present",
      4,
      BinarySearch.search_for( arrayWithDuplicates, 10 , BinarySearch.Instance.LAST )
    );

    test (
      "BinarySearch.search_for, last instance with element not present",
      -1,
      BinarySearch.search_for( arrayWithDuplicates, 11 , BinarySearch.Instance.LAST )
    );

    test (
      "BinarySearch.search_for, first instance, short array, with element present",
      0,
      BinarySearch.search_for( shortArray, 10 , BinarySearch.Instance.FIRST )
    );

    test (
      "BinarySearch.search_for, last instance, short array, with element present",
      0,
      BinarySearch.search_for( shortArray, 10 , BinarySearch.Instance.LAST )
    );

    test (
      "BinarySearch.count, with element present",
      3,
      BinarySearch.count( arrayWithDuplicates, 10 )
    );

    test (
      "BinarySearch.count, with element not present",
      0,
      BinarySearch.count( arrayWithDuplicates, 11 )
    );

    test (
      "BinarySearch.rotations, with no rotations, with recursion",
      0,
      BinarySearch.rotations( array, BinarySearch.Method.RECURSION )
    );

    test (
      "BinarySearch.rotations, with no rotations, with iteration",
      0,
      BinarySearch.rotations( array, BinarySearch.Method.ITERATION )
    );

    test (
      "BinarySearch.rotations, with no method",
      5,
      BinarySearch.rotations( arrayWithRotations )
    );

    test (
      "BinarySearch.rotations, with iteration",
      5,
      BinarySearch.rotations( arrayWithRotations, BinarySearch.Method.ITERATION )
    );

    test (
      "BinarySearch.rotations, with recursion",
      5,
      BinarySearch.rotations( arrayWithRotations, BinarySearch.Method.RECURSION )
    );

    test (
      "BinarySearch.rotations, with duplicates, with recursion",
      6,
      BinarySearch.rotations( rotatedArrayWithDuplicates, BinarySearch.Method.RECURSION )
    );

    test (
      "BinarySearch.rotations, with duplicates, with iteration",
      6,
      BinarySearch.rotations( rotatedArrayWithDuplicates, BinarySearch.Method.ITERATION )
    );

    test (
      "BinarySearch.circular_search, when element is present",
      7,
      BinarySearch.circular_search( arrayWithRotations, 3 )
    );

    test (
      "BinarySearch.circular_search, when element is not present",
      7,
      BinarySearch.circular_search( arrayWithRotations, 3 )
    );
  }

  static final String ANSI_RED = "\u001B[31m";
  static final String ANSI_RESET = "\u001B[0m";

  static void test( String testName, int expected, int actual )
  {
    double startTime = System.nanoTime();
    boolean result = expected == actual;
    double endTime = System.nanoTime();
    double durationInMicroseconds = (endTime - startTime) / 1000;

    if (result) {
      System.out.println(testName);
      System.out.println("PASS: (" + durationInMicroseconds + " μs)");
    } else {
      System.out.println(ANSI_RED + testName + ANSI_RESET);
      System.out.println(ANSI_RED + "Expected: " + expected + ANSI_RESET);
      System.out.println(ANSI_RED + "Actual:   " + actual + ANSI_RESET);
      System.out.println(ANSI_RED + "FAIL: (" + durationInMicroseconds + " μs)"  + ANSI_RESET);
    }
    System.out.println("----------------------------------");
  }
}
