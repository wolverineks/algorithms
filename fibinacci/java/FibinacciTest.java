public class FibinacciTest {

  public static void main( String[] args ) {

    test (
      "Fibinacci.compute, with no options",
      1,
      Fibinacci.compute( 1 )
    );

    test (
      "Fibinacci.compute, recursive",
      2,
      Fibinacci.compute( 2, Fibinacci.Method.RECURSIVE )
    );

    test (
      "Fibinacci.compute, recursive",
      6,
      Fibinacci.compute( 3, Fibinacci.Method.RECURSIVE )
    );

    test (
      "Fibinacci.compute, recursive",
      24,
      Fibinacci.compute( 4, Fibinacci.Method.RECURSIVE )
    );

    test (
      "Fibinacci.compute, recursive",
      120,
      Fibinacci.compute( 5, Fibinacci.Method.RECURSIVE )
    );

    test (
      "Fibinacci.compute, recursive",
      720,
      Fibinacci.compute( 6, Fibinacci.Method.RECURSIVE )
    );

    test (
      "Fibinacci.compute, iterative",
      2,
      Fibinacci.compute( 2, Fibinacci.Method.ITERATIVE )
    );

    test (
      "Fibinacci.compute, iterative",
      6,
      Fibinacci.compute( 3, Fibinacci.Method.ITERATIVE )
    );

    test (
      "Fibinacci.compute, iterative",
      24,
      Fibinacci.compute( 4, Fibinacci.Method.ITERATIVE )
    );

    test (
      "Fibinacci.compute, iterative",
      120,
      Fibinacci.compute( 5, Fibinacci.Method.ITERATIVE )
    );

    test (
      "Fibinacci.compute, iterative",
      720,
      Fibinacci.compute( 6, Fibinacci.Method.ITERATIVE )
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
