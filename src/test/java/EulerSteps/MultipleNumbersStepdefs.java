package EulerSteps;

import EulerMainClass.SumOfMultiple;
import cucumber.api.java.en.Given;

public class MultipleNumbersStepdefs {

    @Given("^User want to verify the sum of all the multiples of the given range of number (\\d+) and (\\d+) below (\\d+)$")
    public void userUserWantToVerifyTheSumOfAllTheMultiplesOfTheGivenRangeOfNumberAndBelow(Integer firstNumber, Integer lastNumber, Integer maxNumber) {
        SumOfMultiple.findTheSumOfMultiple( firstNumber, lastNumber, maxNumber );
    }
}
