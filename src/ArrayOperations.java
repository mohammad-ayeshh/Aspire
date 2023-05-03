public class ArrayOperations {
    public static  boolean isNull(int[] arr){
        return arr != null && arr.length != 0;
    }
    public static int getMin(int[] arr) {
        //Method that returns the minimum value of integer array
        if (isNull(arr)){

            int min = arr[0];
            for (int num : arr) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
        return -99999;
    }
    public static int getMax(int[] arr) {
        //Method that returns the maximum value of integer array
        if (isNull(arr)){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;}
        return -99999;
    }
    public static double getAverage(int[] arr) {
        //Method that returns the average of integer array values
        if (arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int[] getSortedArray(int[] arr) {
        int[] sortedArr = arr.clone();
        int n = sortedArr.length -1;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - i ; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = sortedArr[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        return sortedArr;
    }

    public static void arrayPrint(int[] arr){

        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }

        System.out.print("}");

    }

}
