public class Main {
    public static void main(String[] args) {

    loops loopsClass = new loops();
        System.out.println("Sum of even numbers from 0 to 100 is: " + loopsClass.sumNumbers("even", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + loopsClass.sumNumbers("odd", 100));
        System.out.println("Sum of odd numbers from 0 to 100 is: " + loopsClass.sumNumbers("divisor", 100 ,7));


        loopsClass.sumOfEvenFor(0,100);
        loopsClass.sumOfEvenWhile(0,100);
        loopsClass.sumOfEvenDoWhile(0,100);
        loopsClass.sumOfOddFor(0,100);
        loopsClass.sumOfOddWhile(0,100);
        loopsClass.sumOfOddDoWhile(0,100);
        loopsClass.sumOfDivisibleFor(0,100,7);
        loopsClass.sumOfDivisibleWhile(0,100,7);
        loopsClass.sumOfDivisibleDoWhile(0,100,7);

//-------------------------------------------------------------------------------------------------

        Recurtion recurtionClass = new Recurtion();

        int sum = recurtionClass.calculateSum(1,3,true);
        System.out.println("Sum of odd numbers from 0 to 3 is: " + sum);

        int sum2 = recurtionClass.calculateSum(1,100);
        System.out.println("Sum of numbers from 1 to 100 is: " + sum2);

        int sum3 = recurtionClass.calculateSum(1,100,7);
        System.out.println("Sum of numbers dividable by 7 from 1 to 100 is: " + sum3);




    }
}