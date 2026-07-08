package com.ss.android.ugc.aweme.liveevent;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CalendarEvent {

    @C09CT("alarmMinutes")
    public Integer alarmMinutes;

    @C09CT("anchor")
    public Anchor anchor;

    @C09CT("endTime")
    public long endTime;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("eventId")
    public String eventId;

    @C09CT("note")
    public String note;

    @C09CT("startTime")
    public long startTime;

    @C09CT("title")
    public String title;

    public CalendarEvent(String str, String str2, String str3, long j, long j2, Integer num, String str4, Anchor anchor) {
        this.eventId = str;
        this.title = str2;
        this.note = str3;
        this.startTime = j;
        this.endTime = j2;
        this.alarmMinutes = num;
        this.enterFrom = str4;
        this.anchor = anchor;
    }
}
