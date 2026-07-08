package com.bytedance.android.livesdk.iap;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class IapSubscriptionOfferPricing extends AbsIapPricing {

    @C09CT("billingCycleCount")
    public final int billingCycleCount;

    @C09CT("billingPeriod")
    public final String billingPeriod;

    @C09CT("recurrenceMode")
    public final int recurrenceMode;

    public IapSubscriptionOfferPricing(String str, long j, String str2, String str3, int i, int i2) {
        super(str, j, str2);
        this.billingPeriod = str3;
        this.billingCycleCount = i;
        this.recurrenceMode = i2;
    }
}
