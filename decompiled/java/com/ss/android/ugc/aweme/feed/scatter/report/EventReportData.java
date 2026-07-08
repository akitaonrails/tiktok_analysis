package com.ss.android.ugc.aweme.feed.scatter.report;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class EventReportData implements Serializable {
    public static final int $stable = 8;

    @C09CT("track_event_list")
    public final List<String> eventList;

    @C09CT("report_key_list")
    public final List<String> keyList;

    public EventReportData(List<String> list, List<String> list2) {
        this.keyList = list;
        this.eventList = list2;
    }
}
