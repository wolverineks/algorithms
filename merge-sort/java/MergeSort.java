import java.util.Arrays;

public class MergeSort {

  public enum Order { ASC, DESC }

  public static int[] sort( int[] array ) {
    return sort(array, Order.ASC);
  }

  public static int[] sort( int[] array, Order order ) {
    // Base case. A list of zero or one elements is sorted, by definition.
    if (array.length <= 1) {
      return array;
    }
    // Recursive case. First, divide the list into equal-sized sublists
    // consisting of the first half and second half of the list.
    int mid = (array.length) / 2;

    int[] l = java.util.Arrays.copyOfRange(array, 0, mid);
    int[] r = java.util.Arrays.copyOfRange(array, mid, array.length);

    int[] left  = sort(l, order);
    int[] right = sort(r, order);

    // Then merge the now-sorted sublists.
    return (order == Order.ASC) ? mergeAsc(left, right) : mergeDesc(left, right);
  }

  public static int[] mergeAsc( int[] left, int[] right ) {
    int i = 0;
    int j = 0;
    int k = 0;
    int length = left.length + right.length;
    int[] result = new int[length];

    while (i <= left.length - 1 && j <= right.length - 1) {
      if (left[i] <= right[j]) {
        result[k] = left[i];
        i++;
      } else {
        result[k] = right[j];
        j++;
      }
      k++;
    }

    while (i <= left.length - 1) {
      result[k] = left[i];
      i++;
      k++;
    }
    while (j <= right.length - 1) {
      result[k] = right[j];
      j++;
      k++;
    }
    return result;
  }

  public static int[] mergeDesc( int[] left, int[] right ) {
    int i = 0;
    int j = 0;
    int k = 0;
    int length = left.length + right.length;
    int[] result = new int[length];

    while (i <= left.length - 1 && j <= right.length - 1) {
      if (left[i] >= right[j]) {
        result[k] = left[i];
        i++;
      } else {
        result[k] = right[j];
        j++;
      }
      k++;
    }

    while (i <= left.length - 1) {
      result[k] = left[i];
      i++;
      k++;
    }
    while (j <= right.length - 1) {
      result[k] = right[j];
      j++;
      k++;
    }
    return result;
  }
}
