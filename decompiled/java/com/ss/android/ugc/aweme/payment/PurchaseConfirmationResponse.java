package com.ss.android.ugc.aweme.payment;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseConfirmationResponse extends BaseResponse {

    @C09CT("order_status")
    public final OrderStatus orderStatus;

    @C09CT("purchased_content")
    public final PurchasedContent purchasedContent;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseConfirmationResponse)) {
            return false;
        }
        PurchaseConfirmationResponse purchaseConfirmationResponse = (PurchaseConfirmationResponse) obj;
        return this.orderStatus == purchaseConfirmationResponse.orderStatus && Intrinsics.LJFF(this.purchasedContent, purchaseConfirmationResponse.purchasedContent);
    }

    public final int hashCode() {
        OrderStatus orderStatus = this.orderStatus;
        int iHashCode = (orderStatus == null ? 0 : orderStatus.hashCode()) * 31;
        PurchasedContent purchasedContent = this.purchasedContent;
        return iHashCode + (purchasedContent != null ? purchasedContent.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseConfirmationResponse(orderStatus=");
        sbLIZ.append(this.orderStatus);
        sbLIZ.append(", purchasedContent=");
        sbLIZ.append(this.purchasedContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PurchaseConfirmationResponse(OrderStatus orderStatus, PurchasedContent purchasedContent) {
        this.orderStatus = orderStatus;
        this.purchasedContent = purchasedContent;
    }
}
