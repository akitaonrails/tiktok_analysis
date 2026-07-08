package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class IABRecordingSettingsModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_generate_engaged_info")
    public final boolean enableGenerateEngagedInfo;

    @C09CT("enable_js_event")
    public final boolean enableJsEvent;

    @C09CT("enable_loading_get_match_android")
    public final boolean enableLoadingGetMatch;

    @C09CT("enable_top_n")
    public final boolean enableTopN;

    @C09CT("enable_transfer_pixel")
    public final boolean enableTransferPixel;

    @C09CT("force_enable_js_event")
    public final boolean forceEnableJsEvent;

    @C09CT("js_inject_time_fallback")
    public final long jsInjectTimeFallback;

    public IABRecordingSettingsModel() {
        this(false, false, false, false, false, false, 0L, false);
    }

    public IABRecordingSettingsModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7) {
        this.enable = z;
        this.enableGenerateEngagedInfo = z2;
        this.enableLoadingGetMatch = z3;
        this.enableTopN = z4;
        this.enableTransferPixel = z5;
        this.enableJsEvent = z6;
        this.jsInjectTimeFallback = j;
        this.forceEnableJsEvent = z7;
    }
}
