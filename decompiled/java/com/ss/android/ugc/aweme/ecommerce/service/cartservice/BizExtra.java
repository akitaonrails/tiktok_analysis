package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BizExtra implements Serializable {

    @C09CT("jump_to_cart_succ_toast")
    public final Boolean jumpToCartSuccToast;

    @C09CT("mute_same_fulfillment_feature")
    public final Boolean muteSameFulfillmentFeature;

    @C09CT("mute_success_toast")
    public final Boolean muteSuccessToast;

    public BizExtra() {
        this(null, null, null);
    }

    public BizExtra(Boolean bool, Boolean bool2, Boolean bool3) {
        this.muteSuccessToast = bool;
        this.jumpToCartSuccToast = bool2;
        this.muteSameFulfillmentFeature = bool3;
    }
}
