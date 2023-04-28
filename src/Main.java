public class Main {
    public static void main(String[] args) {


        System.out.println("Sum of even numbers from 0 to 100 is: " + loops.sumNumbers("even", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + loops.sumNumbers("odd", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + loops.sumNumbers("divisor", 100 ,7));


        loops.sumOfEvenFor(0,100);
        loops.sumOfEvenWhile(0,100);
        loops.sumOfEvenDoWhile(0,100);
        loops.sumOfOddFor(0,100);
        loops.sumOfOddWhile(0,100);
        loops.sumOfOddDoWhile(0,100);
        loops.sumOfDivisibleFor(0,100,7);
        loops.sumOfDivisibleWhile(0,100,7);
        loops.sumOfDivisibleDoWhile(0,100,7);

//-------------------------------------------------------------------------------------------------



        int sum = Recurtion.calculateSum(1,3,true);
        System.out.println("Sum of odd numbers from 0 to 3 is: " + sum);

        int sum2 = Recurtion.calculateSum(1,100);
        System.out.println("Sum of numbers from 1 to 100 is: " + sum2);

        int sum3 = Recurtion.calculateSum(1,100,7);
        System.out.println("Sum of numbers dividable by 7 from 1 to 100 is: " + sum3);
//---------------------------------------------------------------------------------------------------
        int[] arr = { 5, 2, 9, 1, 3 };
        System.out.println(ArrayOperations.getMin(arr));

        System.out.println(ArrayOperations.getMax(arr));

        System.out.println(ArrayOperations.getAverage(arr));

        int[] sortedArr = ArrayOperations.getSortedArray(arr);
        ArrayOperations.arrayPrint(sortedArr);

    }
}