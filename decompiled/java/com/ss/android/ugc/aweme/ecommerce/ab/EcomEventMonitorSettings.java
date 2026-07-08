package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomEventMonitorSettings {
    public static final EcomEventMonitorConfig LIZ = new EcomEventMonitorConfig(1, 512000, 10000);

    public static final class EcomEventMonitorConfig {

        @C09CT("event_pair_detect_threshold")
        public final long eventPairDetectThreshold;

        @C09CT("event_report_threshold")
        public final int eventReportThreshold;

        @C09CT("event_size_threshold")
        public final int eventSizeThreshold;

        public EcomEventMonitorConfig() {
            this(1, 512000, 10000L);
        }

        public EcomEventMonitorConfig(int i, int i2, long j) {
            this.eventReportThreshold = i;
            this.eventSizeThreshold = i2;
            this.eventPairDetectThreshold = j;
        }
    }
}
