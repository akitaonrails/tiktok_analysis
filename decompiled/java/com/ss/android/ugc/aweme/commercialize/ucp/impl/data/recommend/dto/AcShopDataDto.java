package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C13LP;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcShopDataDto implements Serializable {

    @C09CT("products")
    public final Map<String, AcShopDetailDto> products;

    @C09CT("protocol_type")
    public final Integer protocolType;

    @C09CT("shopify_fraud_data")
    public final Map<String, String> shopifyFraudData;

    @C09CT("stripe_profile_id")
    public final String stripeProfileId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcShopDataDto)) {
            return false;
        }
        AcShopDataDto acShopDataDto = (AcShopDataDto) obj;
        return Intrinsics.LJFF(this.protocolType, acShopDataDto.protocolType) && Intrinsics.LJFF(this.products, acShopDataDto.products) && Intrinsics.LJFF(this.shopifyFraudData, acShopDataDto.shopifyFraudData) && Intrinsics.LJFF(this.stripeProfileId, acShopDataDto.stripeProfileId);
    }

    public int hashCode() {
        Integer num = this.protocolType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map<String, AcShopDetailDto> map = this.products;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.shopifyFraudData;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.stripeProfileId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopDataDto(protocolType=");
        sbLIZ.append(this.protocolType);
        sbLIZ.append(", products=");
        sbLIZ.append(this.products);
        sbLIZ.append(", shopifyFraudData=");
        sbLIZ.append(this.shopifyFraudData);
        sbLIZ.append(", stripeProfileId=");
        sbLIZ.append(this.stripeProfileId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer resolvedProtocolType() {
        Collection<AcShopDetailDto> collectionValues;
        AcShopDetailDto acShopDetailDto;
        Integer num = this.protocolType;
        if (num != null) {
            return num;
        }
        Map<String, AcShopDetailDto> map = this.products;
        if (map == null || (collectionValues = map.values()) == null || (acShopDetailDto = (AcShopDetailDto) C13LP.LJJJLIIL(collectionValues)) == null) {
            return null;
        }
        return acShopDetailDto.protocolType;
    }

    public AcShopDataDto(Integer num, Map<String, AcShopDetailDto> map, Map<String, String> map2, String str) {
        this.protocolType = num;
        this.products = map;
        this.shopifyFraudData = map2;
        this.stripeProfileId = str;
    }
}
