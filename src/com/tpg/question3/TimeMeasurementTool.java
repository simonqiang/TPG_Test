package com.tpg.question3;

import java.util.concurrent.TimeUnit;

public class TimeMeasurementTool {
    private long start;

    public static TimeMeasurementTool start() {
        return new TimeMeasurementTool();
    }

    private TimeMeasurementTool(){
        reset();
    }

    public TimeMeasurementTool reset() {
        start = System.currentTimeMillis();
        return this;
    }

    public long getTime() {
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long getTime(TimeUnit unit) {
        return unit.convert(getTime(), TimeUnit.MILLISECONDS);
    }
}
