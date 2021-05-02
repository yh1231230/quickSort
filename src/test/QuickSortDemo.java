package test;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void quickSort(int[] arr, int left, int right) {
      if(left>right)
          return;
      int l=left;
      int r=right;
      int base=arr[left];
      while(left!=right){
          if(arr[right]>=base&&right>left)
              right--;
          if(arr[left]<=base&&right>left)
              left++;

          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
      }
      arr[l]=arr[left];
      arr[left]=base;

      quickSort(arr,l,left-1);
      quickSort(arr,left+1,r);

    }
}
