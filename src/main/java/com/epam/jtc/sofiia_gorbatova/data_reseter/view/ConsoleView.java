package com.epam.jtc.sofiia_gorbatova.data_reseter.view;

import java.util.Arrays;

public class ConsoleView {

    public static final String ORIGINAL_DATA_MESSAGE = "Origin Array: %s%n";
    public static final String AMOUNT_ELEMENT_TEMPLATE = "Amount of element " +
            "belonging to a range from %d to %d = %d%n";
    public static final String RESULT_DATA_MESSAGE = "Array after " +
            "transformations: %s%n";
    public static final String NO_RESULT_MESSAGE = "Array hasn't elements " +
            "belonging to a given range";

    public void printOriginData(int[] originArray) {
        System.out.printf(ORIGINAL_DATA_MESSAGE, Arrays.toString(originArray));
    }

    public void printResult(int amount, int[] resultData, int lowLimit,
                            int highLimit) {
        if (amount != 0) {
            printAmountElement(lowLimit, highLimit, amount);
            printResultData(resultData);
        } else {
            printNoResult();
        }
    }

    public void printResultData(int[] resultData) {
        System.out.printf(RESULT_DATA_MESSAGE, Arrays.toString(resultData));
    }

    public void printAmountElement(int lowLimit, int highLimit, int amount) {
        System.out.printf(AMOUNT_ELEMENT_TEMPLATE, lowLimit, highLimit, amount);
    }

    public void printNoResult() {
        System.out.println(NO_RESULT_MESSAGE);
    }
}
