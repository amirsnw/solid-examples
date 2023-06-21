package com.snw.openClose.problem;

public class Main {
    public static void main(String[] args) {

        _ISPSubscriber ispSubscriber =
                new _ISPSubscriber(1, "Somewhere", "123456789",
                        12, 5000);

        _PhoneSubscriber phoneSubscriber =
                new _PhoneSubscriber(2, "Somewhere", "123456789",
                        12);

        System.out.println("ISP Bill: " + ispSubscriber.calculateBill());
        System.out.println("Phone Bill: " + phoneSubscriber.calculateBill());
    }
}
