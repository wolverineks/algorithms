import java.util.Arrays;

public class QuickSort {

  public enum Order { ASC, DESC }

  public static int[] sort( int[] array ) {
    return sort(array, Order.ASC);
  }

  public static int[] sort( int[] array, Order order ) {
    int low = 0;
    int high = array.length - 1;
    int[] result;

    return sort(array, low, high, order);
  }

  public static int[] sort( int[] array, int low, int high, Order order ) {
    if (low < high) {
      int pIndex = partition(array, low, high, order);
      sort(array, low, pIndex - 1, order);
      sort(array, pIndex + 1, high, order);
    }

    return array;
  }

  public static int partition( int[] array, int low, int high, Order order ) {
    int pivot = array[high];
    int pIndex = low;

    if (order == Order.ASC) {
      for (int i = low; i <= high - 1; i++) {
        if (array[i] < pivot) {
          swap(array, i, pIndex);
          pIndex ++;
        }
      }
    }

    if (order == Order.DESC) {
      for (int i = low; i <= high - 1; i++) {
        if (array[i] > pivot) {
          swap(array, i, pIndex);
          pIndex ++;
        }
      }
    }

    swap(array, pIndex, high);

    return pIndex;
  }

  public static int[] swap( int[] array, int index1, int index2 ) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
    return array;
  }
}
