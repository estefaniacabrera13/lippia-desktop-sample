package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}
	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void minus() {
        ActionManager.click(CalculatorConstants.NINE);
        ActionManager.click(CalculatorConstants.MINUS);
        ActionManager.click(CalculatorConstants.SEVEN);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void multiply(){
        ActionManager.click(CalculatorConstants.NINE);
        ActionManager.click(CalculatorConstants.MULTIPLY);
        ActionManager.click(CalculatorConstants.SIX);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void divide(){
        ActionManager.click(CalculatorConstants.SIX);
        ActionManager.click(CalculatorConstants.DIVIDE);
        ActionManager.click(CalculatorConstants.SIX);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    public static void resultPlus() {
        Assert.assertEquals(getResult(),"15");
    }
    public static void resultMinus() {
        Assert.assertEquals(getResult(),"2");
    }
    public static void resultMultiply() {
        Assert.assertEquals(getResult(),"54");
    }
    public static void resultDivide() {
        Assert.assertEquals(getResult(),"1");
    }
    public static String getResult() {
        return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }
}
