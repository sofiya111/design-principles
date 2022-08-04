package com.epam.jtc.sofiia_gorbatova.data_reseter.model;

public class ReseterResult<T1, T2> {
    private T1 amount;
    private T2 resetedData;

    public ReseterResult(T1 amount, T2 resetedData) {
        this.amount = amount;
        this.resetedData = resetedData;
    }

    public T1 getAmount() {
        return amount;
    }

    public T2 getResetedData() {
        return resetedData;
    }
}
