package com.bitmain.intelligent.tax.Bean;

public class TaxResult {

    private int grossPay;
    private int fee;
    private int threshold;
    private int tax;
    private int realSalary;
    private String resultDesc;

    public int getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(int grossPay) {
        this.grossPay = grossPay;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(int realSalary) {
        this.realSalary = realSalary;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
