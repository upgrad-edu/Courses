import java.util.Scanner;

public class Source {
    public static int[] mergeBothInDescendingOrder(int[] array1, int[] array2, int size1, int size2){
        int[] sortedArray = new int[size1+size2];
        int left = size1-1;
        int right = size2-1;
        int i = 0;
        while (left >= 0 && right >=0){
            if (array1[left] > array2[right]){
                sortedArray[i] = array1[left];
                left--;
                i++;
            }
            else{
                sortedArray[i] = array2[right];
                right--;
                i++;
            }
        }
        while(left >=0){
            sortedArray[i] = array1[left];
            left--;
            i++;
        }
        while(right>=0){
            sortedArray[i] = array2[right];
            right--;
            i++;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for(int i=0;i<size1;i++){
            array1[i] = scanner.nextInt();
        }
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for(int i=0;i<size2;i++) {
            array2[i] = scanner.nextInt();
        }
        int[] sortedArray = mergeBothInDescendingOrder(array1,array2,size1,size2);
        for (int number : sortedArray){
            System.out.println(number);
        }
    }
}
