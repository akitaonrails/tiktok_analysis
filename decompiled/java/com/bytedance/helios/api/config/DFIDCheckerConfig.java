package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class DFIDCheckerConfig {

    @C09CT("app2app_enabled")
    public final boolean app2appEnabled;

    @C09CT("app2app_report_sample_rate")
    public final double app2appReportSampleRate;

    @C09CT("stack_sample_rate")
    public final double stackSampleRate;

    public DFIDCheckerConfig() {
        this(false, 0.001d, 0.01d);
    }

    public DFIDCheckerConfig(boolean z, double d, double d2) {
        this.app2appEnabled = z;
        this.app2appReportSampleRate = d;
        this.stackSampleRate = d2;
    }
}
