package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcWidgetLoadAsCoreConfig {

    @C09CT("load_pin_card_as_core")
    public final boolean loadPinCardAsCore;

    @C09CT("load_shop_cart_icon_as_core")
    public final boolean loadShopCartIconAsCore;

    @C09CT("show_pin_card_after_toolbar")
    public final boolean showPinCardAfterShopCartIcon;

    public EcWidgetLoadAsCoreConfig() {
        this(false, false, false);
    }

    public EcWidgetLoadAsCoreConfig(boolean z, boolean z2, boolean z3) {
        this.loadPinCardAsCore = z;
        this.loadShopCartIconAsCore = z2;
        this.showPinCardAfterShopCartIcon = z3;
    }
}
