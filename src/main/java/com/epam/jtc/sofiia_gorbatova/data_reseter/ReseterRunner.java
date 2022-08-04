package com.epam.jtc.sofiia_gorbatova.data_reseter;

import com.epam.jtc.sofiia_gorbatova.data_reseter.model.ReseterResult;
import com.epam.jtc.sofiia_gorbatova.data_reseter.model.Reseter;
import com.epam.jtc.sofiia_gorbatova.data_reseter.view.ConsoleView;

/**
 * Count the number of elements in range from lowerLimit to highLimit.
 * If the arithmetic mean of these elements is greater than their amount,
 * then zero the positive elements
 */

public class ReseterRunner {

    private static final int[] ORIGINAL_DATA = {-50, 0, 3, 1, -8, 10, 25};
    private static final int LOW_LIMIT = 1;
    private static final int HIGH_LIMIT = 12;
    private static ConsoleView consoleView = new ConsoleView();

    public static void main(String[] args) {
        new ReseterRunner().reset();
    }

    private void reset() {
        Reseter reseter = new Reseter();
        consoleView.printOriginData(ORIGINAL_DATA);
        ReseterResult<Integer, int[]> reseterResult =
                reseter.resetData(ORIGINAL_DATA,
                        LOW_LIMIT, HIGH_LIMIT);
        int amount = reseterResult.getAmount();
        consoleView.printResult(amount, reseterResult.getResetedData(),
                LOW_LIMIT, HIGH_LIMIT);
    }
}
