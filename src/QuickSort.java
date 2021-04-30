import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {714, 927, 372, 398};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array, int from, int to) {
        if (from >= to) {
            return;
        }

        int divideIndex = partition(array, from, to);
        sort(array, from, divideIndex);
        sort(array, divideIndex + 1, to);
    }

    static int partition(int[] array, int from, int to) {
        int i = from;
        int j = to;

        int pivot = array[from + (to-from) / 2];

        while (true) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i >= j) {
                return j;
            }
            swap(array, i++, j--);
        }
    }

    static int[] swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
        return array;
    }
}
