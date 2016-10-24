public class InsertionSort {

  public enum Order { ASC, DESC }

  public static int[] sort( int[] array ) {
  	for (int index = 1; index <= array.length - 1; index++){
      int valueIndex = index;
      int value      = array[index];
      int leftIndex  = index - 1;

      while (leftIndex >= 0 && array[leftIndex] > value) {
        swap(array, valueIndex, leftIndex);
        leftIndex--;
        valueIndex--;
      }
    }

    return array;
  }

  public static int[] sort( int[] array, Order order ) {
    for (int index = 1; index <= array.length - 1; index++){
      int valueIndex = index;
      int value      = array[index];
      int leftIndex  = index - 1;

      if (order == Order.ASC) {
        while (leftIndex >= 0 && array[leftIndex] > value) {
          swap(array, valueIndex, leftIndex);
          leftIndex--;
          valueIndex--;
        }
      } else {
        while (leftIndex >= 0 && array[leftIndex] < value) {
          swap(array, valueIndex, leftIndex);
          leftIndex--;
          valueIndex--;
        }
      }
    }

    return array;
  }

  public static void swap( int[] array, int index1, int index2 ) {
  	int temp = array[index1];
  	array[index1] = array[index2];
  	array[index2] = temp;
  }
}
