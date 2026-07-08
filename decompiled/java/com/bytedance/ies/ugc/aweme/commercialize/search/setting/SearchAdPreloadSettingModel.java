package com.bytedance.ies.ugc.aweme.commercialize.search.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdPreloadSettingModel {

    @C09CT("lite_show_event_logger")
    public final boolean enableLiteShowEventLogger;

    @C09CT("delay_mask_layout_inflate")
    public final boolean enableMaskLayoutInflate;

    @C09CT("enable_new_bottom_layout")
    public final boolean enableNewBottomLayout;

    @C09CT("enable_preload_when_ads_recall")
    public final boolean enablePreloadWhenAdsRecall;

    @C09CT("enable_preload")
    public final boolean enableSearchPreload;

    public SearchAdPreloadSettingModel() {
        this(true, true, false, true, true);
    }

    public SearchAdPreloadSettingModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableSearchPreload = z;
        this.enableLiteShowEventLogger = z2;
        this.enablePreloadWhenAdsRecall = z3;
        this.enableMaskLayoutInflate = z4;
        this.enableNewBottomLayout = z5;
    }
}
