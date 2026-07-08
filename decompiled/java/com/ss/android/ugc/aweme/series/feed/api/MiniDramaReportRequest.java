package com.ss.android.ugc.aweme.series.feed.api;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaReportRequest {

    @C09CT("event_type")
    public final Integer eventType;

    @C09CT("feed_card_id")
    public final String feedCardId;

    @C09CT("stay_seconds")
    public final Integer staySeconds;

    public MiniDramaReportRequest() {
        this(null, null, null);
    }

    public MiniDramaReportRequest(Integer num, String str, Integer num2) {
        this.eventType = num;
        this.feedCardId = str;
        this.staySeconds = num2;
    }
}
