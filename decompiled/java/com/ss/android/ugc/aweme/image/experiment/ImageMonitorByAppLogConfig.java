package com.ss.android.ugc.aweme.image.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class ImageMonitorByAppLogConfig {

    @C09CT("enable_report_by_applog")
    public final boolean enableReportByApplog;

    @C09CT("image_monitor_applog")
    public final boolean imageMonitorAppLog;

    @C09CT("image_monitor_applog_sample_rate")
    public final float imageMonitorAppLogSampleRate;

    @C09CT("image_monitor_error_applog")
    public final boolean imageMonitorErrorAppLog;

    @C09CT("image_monitor_error_applog_sample_rate")
    public final float imageMonitorErrorSampleRate;

    @C09CT("image_monitor_exceed_limit_applog")
    public final boolean imageMonitorExceedLimitAppLog;

    @C09CT("image_monitor_exceed_limit_applog_sample_rate")
    public final float imageMonitorExceedLimitAppLogSampleRate;

    @C09CT("image_sample_rate_by_did")
    public final boolean imageMonitorSampleRateByDid;

    @C09CT("image_sensible_monitor_applog")
    public final boolean imageSensibleMonitorApplog;

    @C09CT("image_sensible_monitor_applog_sample_rate")
    public final float imageSensibleMonitorApplogSampleRate;

    public ImageMonitorByAppLogConfig() {
        this(false, false, 1.0f, false, 1.0f, false, 1.0f, false, 1.0f, false);
    }

    public ImageMonitorByAppLogConfig(boolean z, boolean z2, float f, boolean z3, float f2, boolean z4, float f3, boolean z5, float f4, boolean z6) {
        this.enableReportByApplog = z;
        this.imageMonitorAppLog = z2;
        this.imageMonitorAppLogSampleRate = f;
        this.imageMonitorErrorAppLog = z3;
        this.imageMonitorErrorSampleRate = f2;
        this.imageMonitorExceedLimitAppLog = z4;
        this.imageMonitorExceedLimitAppLogSampleRate = f3;
        this.imageSensibleMonitorApplog = z5;
        this.imageSensibleMonitorApplogSampleRate = f4;
        this.imageMonitorSampleRateByDid = z6;
    }
}
