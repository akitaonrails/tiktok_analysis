package com.ss.android.ugc.aweme.liveevent;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EventParams {

    @C09CT("event")
    public CalendarEvent event;

    @C09CT("operation")
    public String operation;

    public EventParams(String str, CalendarEvent calendarEvent) {
        this.operation = str;
        this.event = calendarEvent;
    }
}
