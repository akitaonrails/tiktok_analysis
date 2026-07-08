package com.ss.android.ugc.aweme.web.performance;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class WebResourcesLoadReportSwitchModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_new_performance_report")
    public final boolean enableNewPerformanceReport;

    @C09CT("enable_resources_js_request_error_report")
    public final boolean enableResourcesJsRequestErrorReport;

    @C09CT("enable_resources_native_http_error_report")
    public final boolean enableResourcesNativeHttpErrorReport;

    @C09CT("enable_resources_native_net_error_report")
    public final boolean enableResourcesNativeNetErrorReport;

    @C09CT("js_net_error_sampling_rate")
    public final int jsNetErrorSamplingRate;

    @C09CT("native_http_error_sampling_rate")
    public final int nativeHttpErrorSamplingRate;

    @C09CT("native_net_error_sampling_rate")
    public final int nativeNetErrorSamplingRate;

    @C09CT("resources_slow_time_out")
    public final int resourcesSlowTimeout;

    public WebResourcesLoadReportSwitchModel() {
        this(false, 0, true, 0, false, false, 0, 0);
    }

    public WebResourcesLoadReportSwitchModel(boolean z, int i, boolean z2, int i2, boolean z3, boolean z4, int i3, int i4) {
        this.enableNewPerformanceReport = z;
        this.resourcesSlowTimeout = i;
        this.enableResourcesJsRequestErrorReport = z2;
        this.jsNetErrorSamplingRate = i2;
        this.enableResourcesNativeNetErrorReport = z3;
        this.enableResourcesNativeHttpErrorReport = z4;
        this.nativeNetErrorSamplingRate = i3;
        this.nativeHttpErrorSamplingRate = i4;
    }
}
