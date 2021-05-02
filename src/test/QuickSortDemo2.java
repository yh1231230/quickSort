package test;

import java.util.Map;
import java.util.Set;

public class QuickSortDemo2 {
    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort2(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void quickSort2(int[] arr, int left, int right) {
        if (right < left) {
            return;
        }
        int l = left;
        int r = right;
        int b = arr[l];
        while (left != right) {
            while (arr[right] >= b && right > left)
                right--;
            while (arr[left] <= b && right > left)
                left++;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        arr[l] = arr[left];
        arr[left] = b;

        quickSort2(arr, l, left - 1);
        quickSort2(arr, left + 1, r);

    }


    static void quickSort(int[] arr, int left, int right) {
        if (right < left) {
            return;
        }

        int left0 = left;
        int right0 = right;
        //计算基准数；
        int baseNum = arr[left0];
        while (left != right) {
            //从右开始找比基准数小的
            while (arr[right] >= baseNum && right > left) {
                right--;
            }
            //从左开始找比基准数大的
            while (arr[left] <= baseNum && right > left) {
                left++;
            }
            //交换
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        arr[left0] =arr[left];
        arr[left] = baseNum;

        quickSort(arr, left0, left - 1);
        quickSort(arr, left + 1, right0);
    }
}
