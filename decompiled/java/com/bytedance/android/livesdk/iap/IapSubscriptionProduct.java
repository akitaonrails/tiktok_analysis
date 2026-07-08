package com.bytedance.android.livesdk.iap;

import X.C09CT;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class IapSubscriptionProduct {

    @C09CT("basePlanId")
    public String basePlanId;

    @C09CT("client_payload")
    public String clientPayload;

    @C09CT("offerId")
    public String offerId;

    @C09CT("offerTags")
    public List<String> offerTags;

    @C09CT("offerToken")
    public String offerToken;

    @C09CT("pricingPhases")
    public List<IapSubscriptionOfferPricing> pricingPhases;

    public final String LIZ() {
        List<IapSubscriptionOfferPricing> list = this.pricingPhases;
        return list.isEmpty() ^ true ? ((AbsIapPricing) ListProtector.get(list, 0)).priceCurrencyCode : "";
    }

    public final String LIZIZ() {
        return this.pricingPhases.isEmpty() ^ true ? ((AbsIapPricing) ListProtector.get(this.pricingPhases, 0)).price : "";
    }

    public IapSubscriptionProduct(String str, String str2, String str3, String str4, List<IapSubscriptionOfferPricing> list, List<String> list2) {
        this.clientPayload = str;
        this.offerToken = str2;
        this.basePlanId = str3;
        this.offerId = str4;
        this.pricingPhases = list;
        this.offerTags = list2;
    }
}
