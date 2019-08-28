package com.fabathill.antiprocastination;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Function {

    public static Calendar Epoch2Calender(String epochSeconds) {
        Date update = new Date(Long.parseLong(epochSeconds));
        Calendar mCalendar = Calendar.getInstance();
        mCalendar.setTime(update);
        return mCalendar;
    }

    public static String Epoch2DateString(String epochSeconds, String formatString) {
        Date update = new Date(Long.parseLong(epochSeconds));
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        return format.format(update);
    }
}
