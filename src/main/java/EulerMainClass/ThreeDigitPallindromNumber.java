package EulerMainClass;

public class ThreeDigitPallindromNumber {

    public static void calculatingPallindromNumber() {

        int largestPallindromValue = 0, smallestThreeDigitNumber = 100, largestThreeDigitNumber = 999;

        for (int i = smallestThreeDigitNumber; i <= largestThreeDigitNumber; i++)

            for (int j = i; j <= largestThreeDigitNumber; j++) {
                int newValue = i * j;
                StringBuilder stringBuilderValue = new StringBuilder( "" + newValue );
                String newStringBuilderValue = "" + newValue;
                stringBuilderValue.reverse();
                if (newStringBuilderValue.equals( stringBuilderValue.toString() ) && largestPallindromValue < newValue) {
                    largestPallindromValue = newValue;
                }
            }

        System.out.println( largestPallindromValue );
    }
}

