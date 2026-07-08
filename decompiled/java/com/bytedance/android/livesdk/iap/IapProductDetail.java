package com.bytedance.android.livesdk.iap;

import X.C09CT;
import X.C1617230sBd;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class IapProductDetail {

    @C09CT("oneTimePurchaseProduct")
    public C1617230sBd oneTimePurchaseProduct;

    @C09CT("subscriptionOffer")
    public List<IapSubscriptionProduct> subscriptionOffer;

    @C09CT("productId")
    public String productId = "";

    @C09CT("productType")
    public String productType = "";

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    @C09CT("countryCode")
    public String countryCode = "";

    public final String LIZ(String str, String str2) {
        C1617230sBd c1617230sBd = this.oneTimePurchaseProduct;
        if (c1617230sBd != null) {
            String str3 = c1617230sBd.LIZ;
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        List<IapSubscriptionProduct> list = this.subscriptionOffer;
        if (list != null) {
            for (IapSubscriptionProduct iapSubscriptionProduct : list) {
                if (Intrinsics.LJFF(iapSubscriptionProduct.basePlanId, str) && Intrinsics.LJFF(iapSubscriptionProduct.offerId, str2)) {
                    return iapSubscriptionProduct.clientPayload;
                }
            }
        }
        return "";
    }

    public final IapSubscriptionProduct LIZIZ(String str, String str2) {
        List<IapSubscriptionProduct> list = this.subscriptionOffer;
        if (list != null) {
            for (IapSubscriptionProduct iapSubscriptionProduct : list) {
                if (Intrinsics.LJFF(iapSubscriptionProduct.basePlanId, str) && Intrinsics.LJFF(iapSubscriptionProduct.offerId, str2)) {
                    return iapSubscriptionProduct;
                }
            }
            return null;
        }
        return null;
    }
}
