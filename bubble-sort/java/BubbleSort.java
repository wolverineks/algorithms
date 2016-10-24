public class BubbleSort {

  public enum Order { ASC, DESC }

  public static int[] sort( int[] array ) {
    boolean sorted = true;
    for (int i = 0; i <= array.length - 2; i++) {
      if (array[i] > array[i + 1]) {
        sorted = false;
        swap(array, i, i + 1);
      }
    }
    return sorted == true ? array : sort(array);
  }

  public static int[] sort( int[] array, Order order ) {
    boolean sorted = true;
    for (int i = 0; i <= array.length - 2; i++) {
      switch (order) {
        case ASC: {
          if (array[i] > array[i + 1]) {
            sorted = false;
            swap(array, i, i + 1);
          }
          break;
        }
        case DESC: {
          if (array[i] < array[i + 1]) {
            sorted = false;
            swap(array, i, i + 1);
          }
          break;
        }
      }
    }
    return sorted == true ? array : sort(array, order);
  }

  public static void swap( int[] array, int index1, int index2 ) {
  	int temp = array[index1];
  	array[index1] = array[index2];
  	array[index2] = temp;
  }

}
