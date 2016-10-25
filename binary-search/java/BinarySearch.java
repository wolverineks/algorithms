public class BinarySearch {

  public enum Instance { FIRST, LAST }
  public enum Method { RECURSION, ITERATION }

  public static int search( int[] array, int key ) {
    int lower = 0;
    int upper = array.length - 1;
    int result = -1;

    while (lower <= upper) {
      int mid = (upper + lower) / 2;

      if (array[mid] == key) {
        return mid;
      } else if (array[mid] > key) {
        upper = mid - 1;
      } else {
        lower = mid + 1;
      }
    }
    return result;
  }

  public static int search_for( int[] array, int key, Instance instance ) {
    int lower = 0;
    int upper = array.length - 1;
    int result = -1;

    while (lower <= upper) {
      int mid = (upper + lower) / 2;

      if (array[mid] == key) {
        result = mid;
        if (instance == Instance.LAST) {
          lower = mid + 1;
        } else {
          upper = mid - 1;
        }
      } else if (array[mid] > key) {
        upper = mid - 1;
      } else {
        lower = mid + 1;
      }
    }
    return result;
  }

  public static int count( int[] array, int key ) {
    int lower = 0;
    int upper = array.length - 1;
    int count = 0;

    int first = search_for(array, key, Instance.FIRST);
    if (first == -1) {
      return count;
    }
    int last = search_for(array, key, Instance.LAST);
    count = last - first + 1;

    return count;
  }

  public static int rotations( int[] array ) {
    return iteration_rotations(array);
  }

  public static int rotations( int[] array, Method method ) {
    int result = 0;
    switch (method) {
      case RECURSION:
        result = recursion_rotations(array);
        break;
      case ITERATION:
        result = iteration_rotations(array);
        break;
    }
    return result;
  }

  public static int iteration_rotations( int[] array ) {
    int lower = 0;
    int upper = array.length - 1;

    while (array[lower] > array[upper]) {
      int mid = (lower + upper) / 2;

      if (array[mid] > array[upper]) {
        lower = mid + 1;
      } else {
        upper = mid;
      }
    }

    return lower;
  }

  public static int recursion_rotations( int[] array ) {
    return recursion_rotations(array, 0, array.length - 1);
  }

  public static int recursion_rotations( int[] array, int lower, int upper) {
    int mid = (upper + lower) / 2;
    int result = 0;

    if (array[lower] > array[mid]) {
      result = recursion_rotations(array, lower, mid);
    } else if (array[mid] > array[upper]) {
      result = recursion_rotations(array, mid + 1, upper);
    } else {
      result = lower;
    }

    return result;
  }

  public static int circular_search( int[] array, int key ) {
    int lower = 0;
    int upper = array.length - 1;

    while (lower <= upper) {
      int mid = (lower + upper) / 2;

      if (key == array[mid]) {
        return mid;
      }
      if (array[mid] <= array[upper]) {
        if (key > array[mid] && key <= array[upper]) {
          lower = mid + 1;
        } else {
          upper = mid - 1;
        }
      } else {
        if (key >= array[lower] && key < array[mid]) {
          upper = mid - 1;
        } else {
          lower = mid + 1;
        }
      }
    }
    return -1;
  }
}
