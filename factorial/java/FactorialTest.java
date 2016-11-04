public class FactorialTest {

  public static void main( String[] args ) {

    test (
      "Factorial.compute, with no options",
      1,
      Factorial.compute( 1 )
    );

    test (
      "Factorial.compute, recursive",
      2,
      Factorial.compute( 2, Factorial.Method.RECURSIVE )
    );

    test (
      "Factorial.compute, recursive",
      6,
      Factorial.compute( 3, Factorial.Method.RECURSIVE )
    );

    test (
      "Factorial.compute, recursive",
      24,
      Factorial.compute( 4, Factorial.Method.RECURSIVE )
    );

    test (
      "Factorial.compute, recursive",
      120,
      Factorial.compute( 5, Factorial.Method.RECURSIVE )
    );

    test (
      "Factorial.compute, recursive",
      720,
      Factorial.compute( 6, Factorial.Method.RECURSIVE )
    );

    test (
      "Factorial.compute, iterative",
      2,
      Factorial.compute( 2, Factorial.Method.ITERATIVE )
    );

    test (
      "Factorial.compute, iterative",
      6,
      Factorial.compute( 3, Factorial.Method.ITERATIVE )
    );

    test (
      "Factorial.compute, iterative",
      24,
      Factorial.compute( 4, Factorial.Method.ITERATIVE )
    );

    test (
      "Factorial.compute, iterative",
      120,
      Factorial.compute( 5, Factorial.Method.ITERATIVE )
    );

    test (
      "Factorial.compute, iterative",
      720,
      Factorial.compute( 6, Factorial.Method.ITERATIVE )
    );
  }

  static final String ANSI_RED = "\u001B[31m";
  static final String ANSI_RESET = "\u001B[0m";

  static void test( String testName, int expected, int actual) {
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
