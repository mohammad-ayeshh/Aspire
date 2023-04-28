public class Recurtion {

    public static int calculateSum(int start, int end) {
        if (start == end) {

            return start;
        }
        else {

            return start + calculateSum(start + 1, end);
        }
    }
    public static int calculateSum(int start, int end, boolean odd) {
        if (start == end) {
            if (odd){
                if (start %2 == 1) {
                    return start;
                }
                return 0;
            }
            return 0;
        }
        else {
            if (odd){
                if (start %2 == 1){
                return start + calculateSum(start + 1, end,true);
                }
                return calculateSum(start + 1, end,true);
            }
            return calculateSum(start + 1, end,false);
        }

    }

    public static int calculateSum(int start, int end, int divisor) {
        if (start == end) {

            return (start % divisor == 0) ? start : 0;
        }
        else {
            int currentSum = (start % divisor == 0) ? start : 0;

            return currentSum + calculateSum(start + 1, end, divisor);
        }
    }
}