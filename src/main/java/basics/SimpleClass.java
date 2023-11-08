package basics;

public class SimpleClass {

    public int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }

    public void sortArray(int[] array) {
        int temp;
        boolean swapPreformed = true;
        while (swapPreformed) {
            swapPreformed = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapPreformed = true;
                }
            }
        }
    }
}
