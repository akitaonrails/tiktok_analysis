package com.ss.android.ugc.aweme.ecommercelive.common.infra.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class ECLiveAnimDowngradeSetting {

    @C09CT("pin_card_anim_downgrade")
    public final boolean pinCardAnimDowngrade;

    @C09CT("shop_bag_icon_anim_downgrade")
    public final boolean shopBagIconAnimDowngrade;

    @C09CT("shop_bag_pop_up_anim_downgrade")
    public final boolean shopBagPopupAnimDowngrade;

    @C09CT("short_touch_preview_anim_downgrade")
    public final boolean shortTouchPreviewAnimDowngrade;

    public ECLiveAnimDowngradeSetting() {
        this(false, false, false, false);
    }

    public ECLiveAnimDowngradeSetting(boolean z, boolean z2, boolean z3, boolean z4) {
        this.pinCardAnimDowngrade = z;
        this.shopBagIconAnimDowngrade = z2;
        this.shopBagPopupAnimDowngrade = z3;
        this.shortTouchPreviewAnimDowngrade = z4;
    }
}
