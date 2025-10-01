package com.pluralsight;

public class SubstringExample {
    public static void main(String[] args) {
        String productionCode = "ACME-12213";
        int dashPosition = productionCode.indexOf("-");
        String vendor = productionCode.substring(0, dashPosition);
        String productNum = productionCode.substring(dashPosition + 1);
        System.out.println(vendor);
        System.out.println(productNum);
    }
}
