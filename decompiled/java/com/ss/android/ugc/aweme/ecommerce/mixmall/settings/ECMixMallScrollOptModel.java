package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallScrollOptModel {

    @C09CT("enable_async_play")
    public final boolean enableAsyncPlay;

    @C09CT("enable_delay_exposure_event")
    public final boolean enableDelayExposureEvent;

    @C09CT("enable_no_load_more_event")
    public final boolean enableNoLoadMoreEvent;

    @C09CT("enable_track_report_opt")
    public final boolean enableTrackReportOpt;

    public ECMixMallScrollOptModel() {
        this(false, false, false, false);
    }

    public ECMixMallScrollOptModel(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableAsyncPlay = z;
        this.enableNoLoadMoreEvent = z2;
        this.enableDelayExposureEvent = z3;
        this.enableTrackReportOpt = z4;
    }
}
