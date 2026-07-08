package com.bytedance.ies.xbridge.model.params;

import X.AbstractC1871160ynC;
import X.C1872470ypJ;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes29.dex */
public final class XSetCalendarEventMethodParamModel extends AbstractC1871160ynC {
    public static final C1872470ypJ Companion = new Object() { // from class: X.0ypJ
    };
    public final String action;
    public Long alarmOffsets;
    public Boolean allDay;
    public String eventID;
    public String location;
    public String notes;
    public String title;
    public String url;
    public Long endDate = 0L;
    public Long startDate = 0L;

    public String toString() {
        String canonicalName = XSetCalendarEventMethodParamModel.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(canonicalName);
        sbLIZ.append('(');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("action = ");
        sbLIZ2.append(this.action);
        sbLIZ2.append(" ,");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("eventID = ");
        sbLIZ3.append(this.eventID);
        sbLIZ3.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startDate = ");
        sbLIZ4.append(this.startDate);
        sbLIZ4.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("endDate = ");
        sbLIZ5.append(this.endDate);
        sbLIZ5.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("alarmOffsets = [ ");
        sbLIZ6.append(this.alarmOffsets);
        sbLIZ6.append(' ');
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        sb.append("], ");
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("allDay = ");
        sbLIZ7.append(this.allDay);
        sbLIZ7.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("title = ");
        sbLIZ8.append(this.title);
        sbLIZ8.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("notes = ");
        sbLIZ9.append(this.notes);
        sbLIZ9.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("location = ");
        sbLIZ10.append(this.location);
        sbLIZ10.append(" , ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("url = ");
        sbLIZ11.append(this.url);
        sbLIZ11.append(')');
        sb.append(C2188811AlT.LIZIZ(sbLIZ11));
        return sb.toString();
    }

    public final String getAction() {
        return this.action;
    }

    public final Long getAlarmOffsets() {
        return this.alarmOffsets;
    }

    public final Boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public XSetCalendarEventMethodParamModel(String str) {
        this.action = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.xbridge.model.params.XSetCalendarEventMethodParamModel convert(X.InterfaceC1107590evd r15) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.model.params.XSetCalendarEventMethodParamModel.convert(X.0evd):com.bytedance.ies.xbridge.model.params.XSetCalendarEventMethodParamModel");
    }

    public final void setAlarmOffsets(Long l) {
        this.alarmOffsets = l;
    }

    public final void setAllDay(Boolean bool) {
        this.allDay = bool;
    }

    public final void setEndDate(Long l) {
        this.endDate = l;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setNotes(String str) {
        this.notes = str;
    }

    public final void setStartDate(Long l) {
        this.startDate = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
