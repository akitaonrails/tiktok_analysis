package com.ss.android.ugc.aweme.web.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class WebInfoReportConfigSettings {
    public static final WebInfoReportConfig LIZ;

    static {
        new WebInfoReportConfigSettings();
        LIZ = new WebInfoReportConfig(0, 0, true);
    }

    public static final class WebInfoReportConfig {

        @C09CT("limit_times")
        public final int limitTimes;

        @C09CT("page_count")
        public final int pageCount;

        @C09CT("wifi_only_enable")
        public final boolean wifiOnlyEnable;

        public WebInfoReportConfig() {
            this(0, 0, true);
        }

        public WebInfoReportConfig(int i, int i2, boolean z) {
            this.limitTimes = i;
            this.pageCount = i2;
            this.wifiOnlyEnable = z;
        }
    }
}
