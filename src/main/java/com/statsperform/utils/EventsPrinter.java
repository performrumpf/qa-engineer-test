package com.statsperform.utils;

import com.codeborne.selenide.logevents.LogEvent;
import com.codeborne.selenide.logevents.LogEventListener;

public class EventsPrinter implements LogEventListener {

    private int stepCounter;

    public EventsPrinter() {
        stepCounter = 0;
    }

    @Override
    public void afterEvent(LogEvent logEvent) {
        System.out.printf(" %3d. %s - %s\n", ++stepCounter, logEvent.toString(), logEvent.getStatus());
    }

    @Override
    public void beforeEvent(LogEvent logEvent) {
        // do nothing
    }
}
