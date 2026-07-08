package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonProductDetailsModel implements Serializable {

    @C09CT("deal_details")
    public final Object dealDetails;

    @C09CT("delivery_message")
    public final String deliveryMessage;

    @C09CT("price")
    public final AmazonPriceModel price;

    @C09CT("prime_badge")
    public final AmazonPrimeBadgeModel primeBadge;

    @C09CT("spu_id")
    public final String spuId;

    public final Object getDealDetails() {
        return this.dealDetails;
    }

    public final String getDeliveryMessage() {
        return this.deliveryMessage;
    }

    public final AmazonPriceModel getPrice() {
        return this.price;
    }

    public final AmazonPrimeBadgeModel getPrimeBadge() {
        return this.primeBadge;
    }

    public final String getSpuId() {
        return this.spuId;
    }
}
