package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEntranceColdBootOptConfig implements Serializable {

    @C09CT("opt_check_live_status")
    public final boolean optCheckLiveStatus;

    @C09CT("opt_feed_live_card_component")
    public final boolean optFeedLiveCardComponent;

    @C09CT("opt_filter_duplicate")
    public final boolean optFilterDuplicate;

    @C09CT("opt_live_performance_component")
    public final boolean optLivePerformanceComponent;

    @C09CT("opt_live_report_unread")
    public final boolean optLiveReportUnread;

    @C09CT("opt_live_time_report")
    public final boolean optLiveTimeReport;

    @C09CT("opt_scroll_config")
    public final boolean optScrollConfig;

    public LiveEntranceColdBootOptConfig() {
        this(false, false, false, false, false, false, false);
    }

    public final boolean getOptCheckLiveStatus() {
        return this.optCheckLiveStatus;
    }

    public final boolean getOptFeedLiveCardComponent() {
        return this.optFeedLiveCardComponent;
    }

    public final boolean getOptFilterDuplicate() {
        return this.optFilterDuplicate;
    }

    public final boolean getOptLivePerformanceComponent() {
        return this.optLivePerformanceComponent;
    }

    public final boolean getOptLiveReportUnread() {
        return this.optLiveReportUnread;
    }

    public final boolean getOptLiveTimeReport() {
        return this.optLiveTimeReport;
    }

    public final boolean getOptScrollConfig() {
        return this.optScrollConfig;
    }

    public LiveEntranceColdBootOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.optScrollConfig = z;
        this.optFilterDuplicate = z2;
        this.optFeedLiveCardComponent = z3;
        this.optLivePerformanceComponent = z4;
        this.optCheckLiveStatus = z5;
        this.optLiveReportUnread = z6;
        this.optLiveTimeReport = z7;
    }
}
