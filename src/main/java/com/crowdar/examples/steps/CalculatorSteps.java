package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {
    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.resultPlus();
    }
    @When("Multiply Nive by Six")
    public void multiplyNiveBySix() {
        CalculatorService.multiply();
    }
    @Then("Result is Fiftyfive")
    public void resultIsFiftyfive() {
        CalculatorService.resultMultiply();
    }
    @When("Six divided by Six")
    public void sixDividedBySix() {
        CalculatorService.divide();
    }
    @Then("Result is One")
    public void resultIsOne() {
        CalculatorService.resultDivide();
    }
    @When("Nine Minus Seven")
    public void nineMinusSeven() {
        CalculatorService.minus();
    }
    @Then("Result is Two")
    public void resultIsTwo() {
        CalculatorService.resultMinus();
    }
}