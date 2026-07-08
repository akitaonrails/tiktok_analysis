package com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorLiveBagListOptConfig {

    @C09CT("ec_anchor_shop_bag_list_cross_page_reuse_enable")
    public final boolean crossPageReuseEnabled;

    @C09CT("ec_anchor_shop_bag_list_fcp_enable")
    public final boolean fcpEnabled;

    @C09CT("ec_anchor_shop_bag_list_native_prefetch_enable")
    public final boolean nativePrefetchEnabled;

    @C09CT("ec_anchor_shop_bag_list_pre_render_enable")
    public final boolean preRenderEnabled;

    @C09CT("ec_anchor_shop_bag_list_preload_delay")
    public final int preloadDelayMs;

    @C09CT("ec_anchor_shop_bag_list_preload_enable")
    public final boolean preloadEnabled;

    @C09CT("ec_anchor_shop_bag_list_reuse_enable")
    public final boolean reuseEnabled;

    public AnchorLiveBagListOptConfig() {
        this(false, false, false, false, false, false, 2000);
    }

    public AnchorLiveBagListOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this.preloadEnabled = z;
        this.fcpEnabled = z2;
        this.reuseEnabled = z3;
        this.preRenderEnabled = z4;
        this.nativePrefetchEnabled = z5;
        this.crossPageReuseEnabled = z6;
        this.preloadDelayMs = i;
    }
}
