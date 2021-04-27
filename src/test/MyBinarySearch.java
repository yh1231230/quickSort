package test;

import java.util.Arrays;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(erFen(a, 7));

        int[] b = {1, 3, 5, 6, 2, 4, 0, 8, 7, 9};
        maoPao(b);
        System.out.println();
        int[] c = {1, 3, 5, 6, 2, 4, 0, 8, 7, 9};
        xuanZe1(c);
        System.out.println();
        int[] d = {1, 3, 5, 6, 2, 4, 0, 8, 7, 9};
        xuanZe2(c);

        for(int i=1;i<7;i++){
            System.out.print(diGui(i)+"\t");
        }
        System.out.println();

        System.out.println(diGui2(4));
    }
    //递归
    static int diGui(int x){
        if(x==1||x==2){
            return 1;
        }else
            return diGui(x-1)+diGui(x-2);
    }

    static int diGui2(int x){
        if(x==1){
            return 1;
        }else return x*diGui2(x-1);
    }


    //冒泡排序
    static void maoPao(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] >= a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
            System.out.println(Arrays.toString(a));
        }
    }

    //选择排序
    public static void xuanZe1(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    //选择排序2
    public static void xuanZe2(int[] a) {
        int temp = 0;
        int minIndex;
        for (int i = 0; i < a.length - 1; i++) {
                minIndex=i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]>a[j]){
                  minIndex=j;
                }
            }
            if(a[minIndex]!=a[i]){
                temp=a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;
            }
            System.out.println(Arrays.toString(a));
        }
    }

    //二分法查找索引
    static int erFen(int[] a, int x) {
        int index = -1;
        if (a != null) {
            int min = 0;
            int max = a.length - 1;
            while (max >= min) {
                int mid = (min + max) >> 1;
                if (a[mid] > x) {
                    max = mid - 1;
                } else if (a[mid] < x) {
                    min = mid + 1;
                } else if (a[mid] == x) {
                    index = mid;
                    break;
                }
            }
        }
        return index;
    }
}
