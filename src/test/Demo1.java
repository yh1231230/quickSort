package test;

public class Demo1 {
    public static void main(String[] args) {
        String s = "15 20 25 30 35 40";
        //通过空格分割
        String[] strArr = s.split(" ");
        int[] numberArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numberArr[i] = Integer.parseInt(strArr[i]);
        }

        int j = 1;
        for (int i : numberArr
        ) {
            System.out.print(i + "\t");
            if (j % 5 == 0)
                System.out.println();
            j++;
        }

    }
}
