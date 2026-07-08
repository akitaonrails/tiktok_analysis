package ttp.orbu.sdk.logging;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class LogParams {
    public final Map<String, String> additionalHeaders;
    public final String kind;
    public final List<LogEntry> logEntries;
    public final String logId;
    public final String requestId;
    public final String source;
    public final String subject;

    public LogParams(List<LogEntry> list, String str, String str2, String str3, String str4, Map<String, String> map, String str5) {
        this.logEntries = list;
        this.source = str;
        this.kind = str2;
        this.subject = str3;
        this.requestId = str4;
        this.additionalHeaders = map;
        this.logId = str5;
    }
}
