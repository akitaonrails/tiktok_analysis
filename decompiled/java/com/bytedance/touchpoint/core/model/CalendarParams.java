package com.bytedance.touchpoint.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CalendarParams {

    @C09CT("alarmOffset")
    public final long alarmOffset;

    @C09CT("allDay")
    public final boolean allDay;

    @C09CT("endDate")
    public final long endDate;

    @C09CT("enterFrom")
    public final String enterFrom;

    @C09CT("identifier")
    public final String identifier;

    @C09CT("notes")
    public final String notes;

    @C09CT("repeatCount")
    public final int repeatCount;

    @C09CT("repeatFrequency")
    public final String repeatFrequency;

    @C09CT("repeatInterval")
    public final int repeatInterval;

    @C09CT("startDate")
    public final long startDate;

    @C09CT("title")
    public final String title;

    public CalendarParams() {
        this("", "", 0, 0, -1L, -1L, -1L, false, "", "", "");
    }

    public CalendarParams(String str, String str2, int i, int i2, long j, long j2, long j3, boolean z, String str3, String str4, String str5) {
        this.identifier = str;
        this.repeatFrequency = str2;
        this.repeatInterval = i;
        this.repeatCount = i2;
        this.startDate = j;
        this.endDate = j2;
        this.alarmOffset = j3;
        this.allDay = z;
        this.title = str3;
        this.notes = str4;
        this.enterFrom = str5;
    }
}
