package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AdNoticeCalendar implements Serializable {
    public static final int $stable = 0;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("predict_interval")
    public final long predictInterval;

    @C09CT("start_time")
    public final long startTime;

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getPredictInterval() {
        return this.predictInterval;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
