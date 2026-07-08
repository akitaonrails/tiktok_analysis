package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionProductDetail {

    @C09CT("offer_id")
    public String offerId;

    @C09CT("offer_token")
    public String offerToken;

    @C09CT("price_phase_list")
    public List<PricePhase> pricePhaseList;

    @C09CT("sku_name")
    public String skuName;

    public SubscriptionProductDetail() {
        this(null, null, null, null);
    }

    public static final class PricePhase {

        @C09CT("currency")
        public String currency;

        @C09CT("price")
        public String price;

        @C09CT("price_amount_micros")
        public final Long priceAmountMicros;

        public PricePhase() {
            this(null, null, null);
        }

        public PricePhase(String str, String str2, Long l) {
            this.currency = str;
            this.price = str2;
            this.priceAmountMicros = l;
        }
    }

    public SubscriptionProductDetail(String str, String str2, String str3, List<PricePhase> list) {
        this.skuName = str;
        this.offerId = str2;
        this.offerToken = str3;
        this.pricePhaseList = list;
    }
}
