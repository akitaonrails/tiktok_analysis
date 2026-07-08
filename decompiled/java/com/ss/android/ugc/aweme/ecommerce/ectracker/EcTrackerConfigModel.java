package com.ss.android.ugc.aweme.ecommerce.ectracker;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class EcTrackerConfigModel {

    @C09CT("enable_error_report")
    public final boolean enableErrorReport;

    @C09CT("filter_configs")
    public final List<EcTrackerFilterConfig> filterConfigs;

    @C09CT("sdk_switch")
    public final boolean sdkSwitch;

    @C09CT("total_large_report_size")
    public final Long totalLargeReportSize;

    public EcTrackerConfigModel(boolean z, boolean z2, Long l, List<EcTrackerFilterConfig> list) {
        this.sdkSwitch = z;
        this.enableErrorReport = z2;
        this.totalLargeReportSize = l;
        this.filterConfigs = list;
    }
}
