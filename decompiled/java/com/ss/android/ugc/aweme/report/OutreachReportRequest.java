package com.ss.android.ugc.aweme.report;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class OutreachReportRequest {

    @C09CT("event_type")
    public final String eventType;

    @C09CT("s2s_event")
    public final S2SEventBean s2sEvent;

    public OutreachReportRequest() {
        this(null, null);
    }

    public OutreachReportRequest(String str, S2SEventBean s2SEventBean) {
        this.eventType = str;
        this.s2sEvent = s2SEventBean;
    }
}
