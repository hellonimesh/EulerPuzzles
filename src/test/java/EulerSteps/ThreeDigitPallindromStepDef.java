package EulerSteps;

import EulerMainClass.ThreeDigitPallindromNumber;
import cucumber.api.java.en.Given;

public class ThreeDigitPallindromStepDef {
    @Given("^User want to verify largest palindrome made from the product of two three digit numbers$")
    public void userWantToVerifyLargestPalindromeMadeFromTheProductOfTwoThreeDigitNumbers() {
        ThreeDigitPallindromNumber.calculatingPallindromNumber();
    }
}
