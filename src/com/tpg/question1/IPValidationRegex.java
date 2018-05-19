package com.tpg.question1;

import java.util.regex.Pattern;

public class IPValidationRegex {
    private static final Pattern PATTERN =
            Pattern.compile(
                    "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.)" +
                    "{3}" +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public boolean validateIPAddress(String ipAddress) {
        return PATTERN.matcher(ipAddress).matches();
    }


}
