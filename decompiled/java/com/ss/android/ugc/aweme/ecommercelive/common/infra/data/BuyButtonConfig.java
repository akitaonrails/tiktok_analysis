package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BuyButtonConfig implements Serializable {

    @C09CT("live_bag_buy_button_config")
    public final Map<String, BuyButtonProperty> liveBagBuyButtonConfig;

    @C09CT("pin_card_buy_button_config")
    public final Map<String, BuyButtonProperty> pinCardBuyButtonConfig;

    public BuyButtonConfig() {
        this(null, null);
    }

    public BuyButtonConfig(Map<String, BuyButtonProperty> map, Map<String, BuyButtonProperty> map2) {
        this.pinCardBuyButtonConfig = map;
        this.liveBagBuyButtonConfig = map2;
    }
}
