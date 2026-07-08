package com.bytedance.globalpayment.iap.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class IapCommonProduct {

    @C09CT("clientPayload")
    public final String clientPayload;

    @C09CT("description")
    public final String description;

    @C09CT("pricePhases")
    public final List<AbsIapPricingPhase> pricePhases;

    @C09CT("productType")
    public final String productType;

    @C09CT("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public IapCommonProduct(String str, String str2, String str3, List<? extends AbsIapPricingPhase> list, String str4) {
        this.productType = str;
        this.title = str2;
        this.description = str3;
        this.pricePhases = list;
        this.clientPayload = str4;
    }
}
