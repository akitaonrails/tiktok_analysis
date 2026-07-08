package com.ss.android.ugc.aweme.web.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class EndlayerAutoReportConfigExp {
    public static final EndlayerAutoReportConfig LIZ = new EndlayerAutoReportConfig(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(291));

    public static final class EndlayerAutoReportConfig {

        @C09CT("auto_load_iab")
        public final long autoLoadIab;

        @C09CT("auto_report_click_time")
        public final long autoReportClickTime;

        public EndlayerAutoReportConfig() {
            this(0L, 0L);
        }

        public EndlayerAutoReportConfig(long j, long j2) {
            this.autoReportClickTime = j;
            this.autoLoadIab = j2;
        }
    }
}
