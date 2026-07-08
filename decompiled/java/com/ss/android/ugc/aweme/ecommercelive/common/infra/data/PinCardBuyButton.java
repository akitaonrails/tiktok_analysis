package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PinCardBuyButton implements Serializable {

    @C09CT("pin_card_buy_button_type")
    public Integer buyButtonType;

    @C09CT("checkout_config")
    public final OneStepCheckoutConfig oneStepCheckoutConfig;

    public PinCardBuyButton() {
        this(0, null);
    }

    public final void setBuyButtonType(Integer num) {
        this.buyButtonType = num;
    }

    public PinCardBuyButton(Integer num, OneStepCheckoutConfig oneStepCheckoutConfig) {
        this.buyButtonType = num;
        this.oneStepCheckoutConfig = oneStepCheckoutConfig;
    }
}
