package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLivePlaybackProductCardInfo {

    @C09CT("buy_button_config")
    public final BuyButtonConfig buyButtonConfig;

    @C09CT("products")
    public final List<Product> product;

    @C09CT("promotion_style")
    public final String promotionStyleConfig;

    public ECLivePlaybackProductCardInfo() {
        this(null, null, null);
    }

    public ECLivePlaybackProductCardInfo(List<Product> list, String str, BuyButtonConfig buyButtonConfig) {
        this.product = list;
        this.promotionStyleConfig = str;
        this.buyButtonConfig = buyButtonConfig;
    }
}
