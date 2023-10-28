public class Main {

    public static void main(String[] args) {

        // Challenge: - Create a loop that starts at 1 and ends at 1000, increments by 1
        //            - Sum all the numbers that can be divided by both 3 and 5
        //            - Print out the numbers that have met the above condition
        //            - Break out of the lop once you have found 5 numbers that met the above conditions
        //            - After breaking out of the loop, print the sum of the numbers that met the above conditions


        // After watching instructor solve
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sumOfMatches);


//  --------------- My original solution -----------------------
//        int count = 0;
//
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                count++;
//                if (count == 5){
//                    break;
//                }
//                System.out.println(i + i);
//            }
//        }
    }
}