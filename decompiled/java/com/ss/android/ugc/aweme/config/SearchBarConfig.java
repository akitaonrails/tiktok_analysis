package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBarConfig {

    @C09CT("enable_mall_video")
    public final boolean enableMallVideo;

    @C09CT("enable_order_video_in_mall_new")
    public final boolean enableOrderVideoInMall;

    @C09CT("enable_order_video_out_mall_new")
    public final boolean enableOrderVideoOutMall;

    @C09CT("enable_shop_video_in_mall")
    public final boolean enableShopVideoInMall;

    @C09CT("enable_shop_video_out_mall")
    public final boolean enableShopVideoOutMall;

    @C09CT("enable_simple_search_video_tab")
    public final boolean enableVideoVerticalTab;

    public SearchBarConfig() {
        this(false, false, false, false, false, true);
    }

    public SearchBarConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableOrderVideoInMall = z;
        this.enableOrderVideoOutMall = z2;
        this.enableShopVideoInMall = z3;
        this.enableShopVideoOutMall = z4;
        this.enableMallVideo = z5;
        this.enableVideoVerticalTab = z6;
    }
}
