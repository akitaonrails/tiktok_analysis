package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaidCollectionRefundResponse extends BaseResponse {

    @C09CT("refund_amounts")
    public final List<PriceInfo> refundAmounts;

    @C09CT("web_purchase_price")
    public final String webPurchasePrice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionRefundResponse)) {
            return false;
        }
        PaidCollectionRefundResponse paidCollectionRefundResponse = (PaidCollectionRefundResponse) obj;
        return Intrinsics.LJFF(this.webPurchasePrice, paidCollectionRefundResponse.webPurchasePrice) && Intrinsics.LJFF(this.refundAmounts, paidCollectionRefundResponse.refundAmounts);
    }

    public final int hashCode() {
        return (this.webPurchasePrice.hashCode() * 31) + this.refundAmounts.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionRefundResponse(webPurchasePrice=");
        sbLIZ.append(this.webPurchasePrice);
        sbLIZ.append(", refundAmounts=");
        sbLIZ.append(this.refundAmounts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaidCollectionRefundResponse() {
        this("", Collections.emptyList());
    }

    public PaidCollectionRefundResponse(String str, List<PriceInfo> list) {
        this.webPurchasePrice = str;
        this.refundAmounts = list;
    }
}
