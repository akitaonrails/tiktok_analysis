package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveBagBuyButton implements Serializable {

    @C09CT("live_bag_buy_button_type")
    public Integer buyButtonType;

    public LiveBagBuyButton() {
        this(0);
    }

    public LiveBagBuyButton(Integer num) {
        this.buyButtonType = num;
    }

    public final void setBuyButtonType(Integer num) {
        this.buyButtonType = num;
    }
}
