package EulerMainClass;

public class FindPrimeNumber {

    public static void findgivenPrimeNumber(int givenPrimeNumber) {

        // the prime number is can be divide by only 1 and itself only

        // returns nth prime number
        long initialPrime = 0;
        int actualNumber = 1, upperLimit = 10000000;
        boolean[] prediction = new boolean[upperLimit];

        // returns true if parameter is the prime number otherwise false
        for (int i = 2; i < upperLimit; i++) {
            if (prediction[i]) continue;

            initialPrime++;

            if (initialPrime == givenPrimeNumber) {
                actualNumber = i;
                break;
            }

            for (int j = i + i; j < upperLimit; j += i)
                prediction[j] = true;
        }
        System.out.println( "10001st Prime number is : " + actualNumber );
    }
}
