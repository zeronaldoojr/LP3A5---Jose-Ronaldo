package QuickSortForkJoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoin {

  private static final int SIZE = 10000;

  public static void main(String[] args) {
    int[] data1 = new int[SIZE];
    Random rand = new Random();
    for (int i = 0; i < data1.length; i++) {
      int randomNum = rand.nextInt((SIZE) + 1);

      data1[i] = randomNum;

    }
    QuickSort quickSort = new QuickSort(data1);

    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(quickSort);

    pool.shutdown();

    System.out.println("data = " + Arrays.toString(data1));
  }
}
