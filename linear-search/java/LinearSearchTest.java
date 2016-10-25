public class LinearSearchTest {

  public static void main( String[] args ) {
    int[] array = {3, 2, 6, 8, 4, 7, 5, 9, 1};

    test(
      "LinearSearch.search, with element present",
      6,
      LinearSearch.search( array, 5 )
    );

      test(
        "LinearSearch.search, with element not present",
        -1,
        LinearSearch.search( array, 21 )
      );
  }

  static final String ANSI_RED = "\u001B[31m";
  static final String ANSI_RESET = "\u001B[0m";

  static void test( String testName, int expected, int actual ) {
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
