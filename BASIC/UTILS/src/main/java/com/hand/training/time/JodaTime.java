package com.hand.training.time;

import org.joda.time.DateTime;

import java.util.List;

public class JodaTime {


    public static void main(String[] args) {
        DateTime pre = DateTime.now().withSecondOfMinute(0).withMillisOfSecond(0);
        for (int start = 0; start < 10; start++) {
            DateTime next = pre.plusSeconds(59);
            pre = next.plusSeconds(1);
        }

        /*DateTime dateTime = new DateTime(2020,2,29,0,0,0);
        final DateTime dateTime1 = dateTime.minusYears(1);
        System.currentTimeMillis();

        final DateTime dateTime2 = DateTime.now().withSecondOfMinute(0).withMillisOfSecond(0);*/
        System.currentTimeMillis();
    }
}
