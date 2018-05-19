package com.tpg;

import com.tpg.question1.IPValidationRegex;

public class Main {

    public static void main(String[] args) {
        IPValidationRegex ipValidationRegex = new IPValidationRegex();
        System.out.println(ipValidationRegex.validateIPAddress("2.255.255.2551"));
    }
}
