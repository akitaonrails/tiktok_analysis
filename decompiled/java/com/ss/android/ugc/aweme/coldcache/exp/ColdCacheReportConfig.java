package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ColdCacheReportConfig {

    @C09CT("report_after_first_frame_opt")
    public final boolean reportAfterFirstFrameOpt;

    @C09CT("report_brand_safety")
    public final boolean reportBrandSafety;

    @C09CT("report_cur_size")
    public final boolean reportCurSize;

    @C09CT("report_select_url_details")
    public final boolean reportSelectUrlDetails;

    @C09CT("report_used_cache_event")
    public final boolean reportUseCacheEvent;

    public ColdCacheReportConfig() {
        this(false, false, false, false, false);
    }

    public ColdCacheReportConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.reportAfterFirstFrameOpt = z;
        this.reportCurSize = z2;
        this.reportBrandSafety = z3;
        this.reportUseCacheEvent = z4;
        this.reportSelectUrlDetails = z5;
    }
}
