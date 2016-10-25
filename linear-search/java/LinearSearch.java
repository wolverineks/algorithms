public class LinearSearch {

  public static int search( int[] array, int key) {
    for (int i = 0; i <= array.length - 1; i++) {
      if (array[i] == key) {
        return i;
      }
    }
    return -1;
  }
}
