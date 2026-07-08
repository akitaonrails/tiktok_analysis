package ttp.orbu.sdk.logging;

import java.util.Date;

/* JADX INFO: loaded from: classes24.dex */
public final class LogEntry {
    public final String data;
    public final String id;
    public final Date time;

    public LogEntry(String str, String str2, Date date) {
        this.id = str;
        this.data = str2;
        this.time = date;
    }
}
