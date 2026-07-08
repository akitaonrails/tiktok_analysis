package com.ss.android.ugc.aweme.commercialize.model.ucp;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcShopData implements Serializable {

    @C09CT("client_smart_judgment")
    public final Integer clientSmartJudgment;

    @C09CT("payment_type")
    public final Integer paymentType;

    @C09CT("products")
    public final Map<String, Map<String, Object>> products;

    @C09CT("protocol_type")
    public final Integer protocolType;

    @C09CT("shopify_fraud_data")
    public final Map<String, String> shopifyFraudData;

    @C09CT("stripe_profile_id")
    public final String stripeProfileId;

    @C09CT("view_site_type")
    public final Integer viewSiteType;

    public AcShopData() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcShopData)) {
            return false;
        }
        AcShopData acShopData = (AcShopData) obj;
        return Intrinsics.LJFF(this.products, acShopData.products) && Intrinsics.LJFF(this.clientSmartJudgment, acShopData.clientSmartJudgment) && Intrinsics.LJFF(this.protocolType, acShopData.protocolType) && Intrinsics.LJFF(this.viewSiteType, acShopData.viewSiteType) && Intrinsics.LJFF(this.shopifyFraudData, acShopData.shopifyFraudData) && Intrinsics.LJFF(this.paymentType, acShopData.paymentType) && Intrinsics.LJFF(this.stripeProfileId, acShopData.stripeProfileId);
    }

    public int hashCode() {
        Map<String, Map<String, Object>> map = this.products;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Integer num = this.clientSmartJudgment;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.protocolType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.viewSiteType;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map<String, String> map2 = this.shopifyFraudData;
        int iHashCode5 = (iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num4 = this.paymentType;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.stripeProfileId;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopData(products=");
        sbLIZ.append(this.products);
        sbLIZ.append(", clientSmartJudgment=");
        sbLIZ.append(this.clientSmartJudgment);
        sbLIZ.append(", protocolType=");
        sbLIZ.append(this.protocolType);
        sbLIZ.append(", viewSiteType=");
        sbLIZ.append(this.viewSiteType);
        sbLIZ.append(", shopifyFraudData=");
        sbLIZ.append(this.shopifyFraudData);
        sbLIZ.append(", paymentType=");
        sbLIZ.append(this.paymentType);
        sbLIZ.append(", stripeProfileId=");
        sbLIZ.append(this.stripeProfileId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcShopData(Map<String, ? extends Map<String, ? extends Object>> map, Integer num, Integer num2, Integer num3, Map<String, String> map2, Integer num4, String str) {
        this.products = map;
        this.clientSmartJudgment = num;
        this.protocolType = num2;
        this.viewSiteType = num3;
        this.shopifyFraudData = map2;
        this.paymentType = num4;
        this.stripeProfileId = str;
    }
}
