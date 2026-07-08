package com.bytedance.pumbaa.settings.impl;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxAspectConfig {

    @C09CT("forbid_report_for_3rd_page")
    public boolean forbidReportFor3rdPage;

    @C09CT("report_intercept_sample_rate")
    public double reportInterceptSampleRate;

    @C09CT("report_sample_rate")
    public double reportSampleRate;

    @C09CT("use_new_arch")
    public boolean useNewArch;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SandboxAspectConfig)) {
            return false;
        }
        SandboxAspectConfig sandboxAspectConfig = (SandboxAspectConfig) obj;
        return Double.compare(this.reportSampleRate, sandboxAspectConfig.reportSampleRate) == 0 && Double.compare(this.reportInterceptSampleRate, sandboxAspectConfig.reportInterceptSampleRate) == 0 && this.useNewArch == sandboxAspectConfig.useNewArch && this.forbidReportFor3rdPage == sandboxAspectConfig.forbidReportFor3rdPage;
    }

    public SandboxAspectConfig() {
        this(0.001d, 1.0d, false, false);
    }

    public SandboxAspectConfig(double d, double d2, boolean z, boolean z2) {
        this.reportSampleRate = d;
        this.reportInterceptSampleRate = d2;
        this.useNewArch = z;
        this.forbidReportFor3rdPage = z2;
    }
}
