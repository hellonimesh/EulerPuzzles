package EulerSteps;

import EulerMainClass.CalculatingNameScore;
import cucumber.api.java.en.Given;

import java.io.IOException;

public class CalculatingNameScoreStepDef {
    @Given("^User can verify and obtain a name scores in the given text file$")
    public void userCanVerifyAndObtainANameScoresInTheGivenTextFile() throws IOException {
        CalculatingNameScore.calcultingTotalOfNameScore();
    }
}
