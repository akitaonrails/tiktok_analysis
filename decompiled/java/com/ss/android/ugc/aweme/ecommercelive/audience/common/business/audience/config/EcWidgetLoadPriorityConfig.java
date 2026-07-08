package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcWidgetLoadPriorityConfig {

    @C09CT("load_pin_card_as_p0")
    public final boolean loadPinCardAsP0;

    @C09CT("load_shop_cart_icon_as_p0")
    public final boolean loadShopCartIconAsP0;

    @C09CT("load_widget_after_frame_callback")
    public final boolean loadWidgetAfterFrameCallback;

    public EcWidgetLoadPriorityConfig() {
        this(false, false, false);
    }

    public EcWidgetLoadPriorityConfig(boolean z, boolean z2, boolean z3) {
        this.loadPinCardAsP0 = z;
        this.loadShopCartIconAsP0 = z2;
        this.loadWidgetAfterFrameCallback = z3;
    }
}
