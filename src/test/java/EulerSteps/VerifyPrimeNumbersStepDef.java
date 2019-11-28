package EulerSteps;

import EulerMainClass.FindPrimeNumber;
import cucumber.api.java.en.Given;

public class VerifyPrimeNumbersStepDef {
    @Given("^User can verify the (\\d+)st prime number$")
    public void userCanFindTheTheStPrimeNumber(int givenPrimeNumber) {
        FindPrimeNumber.findgivenPrimeNumber(givenPrimeNumber);
    }
}
