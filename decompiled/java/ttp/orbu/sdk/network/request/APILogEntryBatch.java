package ttp.orbu.sdk.network.request;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class APILogEntryBatch {
    public final String defaultlogentrytime;
    public final List<APILogEntry> entries;
    public final String source;
    public final String subject;
    public final String type;

    public final APILogEntryBatch copy(String str, List<APILogEntry> list, String str2, String str3, String str4) {
        return new APILogEntryBatch(str, list, str2, str3, str4);
    }

    public APILogEntryBatch(String str, List<APILogEntry> list, String str2, String str3, String str4) {
        this.defaultlogentrytime = str;
        this.entries = list;
        this.source = str2;
        this.subject = str3;
        this.type = str4;
    }
}
