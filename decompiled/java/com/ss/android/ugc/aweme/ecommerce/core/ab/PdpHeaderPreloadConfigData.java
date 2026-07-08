package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PdpHeaderPreloadConfigData {

    @C09CT("preload_when_data_ready")
    public final int enablePreloadWhenDataReady;

    @C09CT("preload_when_scroll_end")
    public final int enablePreloadWhenScrollEnd;

    @C09CT("preload_when_sku_touch")
    public final int enablePreloadWhenSkuTouch;

    @C09CT("preload_all_network_threshold")
    public final int preloadAllNetworkThreshold;

    @C09CT("preload_image_to_disk")
    public final int preloadImageToDisk;

    public PdpHeaderPreloadConfigData() {
        this(0, 0, 0, 0, 100);
    }

    public PdpHeaderPreloadConfigData(int i, int i2, int i3, int i4, int i5) {
        this.preloadImageToDisk = i;
        this.enablePreloadWhenScrollEnd = i2;
        this.enablePreloadWhenSkuTouch = i3;
        this.enablePreloadWhenDataReady = i4;
        this.preloadAllNetworkThreshold = i5;
    }
}
