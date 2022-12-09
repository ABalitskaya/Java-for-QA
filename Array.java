package HW1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(Delete(array, 0)));





    }
    /* Этот метод я писала самостоятельно ровно до момента, когда нужно было выкинуть из массива последние индексы.
    * Так что признаюсь, что return скопировала из вашего кода во время занятия, так как самостоятельно не додумалась,
    * как это сделать*/

    public static int[] Delete(int[] array, int key) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                count++;
            } else {
                array[i - count] = array[i];
            }

        } return Arrays.copyOf(array, array.length - count);
    }



}
