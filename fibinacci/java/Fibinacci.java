public class Fibinacci {

  public enum Method { RECURSIVE, ITERATIVE }

  public static int compute( int number ) {
    return computeRecursive(number, Method.RECURSIVE);
  }

  public static int compute( int number, Method method ) {
    if (method == Method.RECURSIVE) {
      return computeRecursive(number, Method.RECURSIVE);
    } else {
      return computeIterative(number, Method.ITERATIVE);
    }
  }

  public static int computeIterative( int number, Method method ) {
    int result = 1;
    while (number > 0) {
      result = result * number;
      number--;
    }

    return result;
  }

  public static int computeRecursive( int number, Method method ) {
    if (number < 2) {
      return 1;
    }
    int result = number * computeRecursive(number - 1, Method.RECURSIVE);

    return result;
  }
}
