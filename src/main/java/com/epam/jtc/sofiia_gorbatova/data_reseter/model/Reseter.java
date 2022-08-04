package com.epam.jtc.sofiia_gorbatova.data_reseter.model;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Reseter {

    public ReseterResult<Integer, int[]> resetData(int[] data,
                                                   int lowLimit,
                                                   int highLimit) {
        IntSummaryStatistics intSummaryStatistics =
                getSummaryStatistics(data, lowLimit, highLimit);
        int amount = (int) intSummaryStatistics.getCount();
        int[] resetedData = data;
        if (amount != 0 && intSummaryStatistics.getAverage() > amount) {
            resetedData = zeroPositiveElements(data, lowLimit, highLimit);
        }

        return new ReseterResult<>(amount, resetedData);
    }

    private IntSummaryStatistics getSummaryStatistics(int[] data, int lowLimit,
                                                      int highLimit) {
        IntStream dataInRange =
                Arrays.stream(data)
                        .filter(n -> isInRange(lowLimit, highLimit, n));

        return dataInRange.summaryStatistics();
    }

    private boolean isInRange(int lowLimit, int highLimit, int number) {
        return number >= lowLimit && number <= highLimit;
    }

    public int[] zeroPositiveElements(int[] data, int lowLimit, int highLimit) {
        int length = data.length;
        int[] resetData = new int[length];
        for (int i = 0; i < length; i++) {
            if (data[i] > 0 && isInRange(lowLimit, highLimit, data[i])) {
                resetData[i] = 0;
            } else {
                resetData[i] = data[i];
            }
        }

        return resetData;
    }


}
