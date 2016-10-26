public class SelectionSort {

  public enum Order { ASC, DESC }

  public static int[] sort( int[] array ) {
    return sort(array, Order.ASC);
  }

  public static int[] sort( int[] array, Order order ) {
    for (int i = 0; i <= array.length - 1; i++) {
      for (int j = i + 1; j <= array.length - 1; j++) {
        if (array[j] < array[i] && order == Order.ASC) {
          swap(array, i, j);
        } else if (array[j] > array[i] && order == Order.DESC) {
          swap(array, i, j);
        }
      }
    }

    return array;
  }

  public static int[] swap( int[] array, int index1, int index2 ) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

    return array;
  }
}
