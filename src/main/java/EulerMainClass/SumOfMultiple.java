package EulerMainClass;

public class SumOfMultiple {

    public static void findTheSumOfMultiple(Integer firstNumber, Integer lastNumber, Integer range) {

        int sumOfMultiples = 0;
        boolean firstGivenNumber = false, lastGivenNumber = false;

        for (int i = firstNumber; i < range; i++) {

            //verify that reminder is zero
            firstGivenNumber = i % firstNumber == 0;
            lastGivenNumber = i % lastNumber == 0;

            if (firstGivenNumber || lastGivenNumber) sumOfMultiples += i;
        }

        System.out.println( sumOfMultiples );
    }

}
