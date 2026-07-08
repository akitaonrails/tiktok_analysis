package com.ss.android.ugc.aweme.payment;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MarketplaceCreateOrderResponse extends BaseResponse {

    @C09CT("discount_info")
    public final DiscountInfo discountInfo;

    @C09CT("iap_info")
    public final IapInfo iapInfo;

    @C09CT("order_id")
    public final String orderId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceCreateOrderResponse)) {
            return false;
        }
        MarketplaceCreateOrderResponse marketplaceCreateOrderResponse = (MarketplaceCreateOrderResponse) obj;
        return Intrinsics.LJFF(this.orderId, marketplaceCreateOrderResponse.orderId) && Intrinsics.LJFF(this.discountInfo, marketplaceCreateOrderResponse.discountInfo) && Intrinsics.LJFF(this.iapInfo, marketplaceCreateOrderResponse.iapInfo);
    }

    public final int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.discountInfo.hashCode()) * 31) + this.iapInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarketplaceCreateOrderResponse(orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(", discountInfo=");
        sbLIZ.append(this.discountInfo);
        sbLIZ.append(", iapInfo=");
        sbLIZ.append(this.iapInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MarketplaceCreateOrderResponse() {
        this("", new DiscountInfo(VoucherUseStatus.NO_VOUCHER_USED), new IapInfo("", "", ""));
    }

    public MarketplaceCreateOrderResponse(String str, DiscountInfo discountInfo, IapInfo iapInfo) {
        this.orderId = str;
        this.discountInfo = discountInfo;
        this.iapInfo = iapInfo;
    }
}
