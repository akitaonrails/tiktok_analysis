package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.google.gson.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PinedProductsResponse extends BaseResponse {

    @C09CT("biz_status_msg")
    public final String bizStatusMsg;

    @C09CT("pin_second_duration")
    public final Integer pinSecondDuration;

    @C09CT("pined_product")
    public final k pinedProduct;

    public PinedProductsResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinedProductsResponse)) {
            return false;
        }
        PinedProductsResponse pinedProductsResponse = (PinedProductsResponse) obj;
        return Intrinsics.LJFF(this.bizStatusMsg, pinedProductsResponse.bizStatusMsg) && Intrinsics.LJFF(this.pinedProduct, pinedProductsResponse.pinedProduct) && Intrinsics.LJFF(this.pinSecondDuration, pinedProductsResponse.pinSecondDuration);
    }

    public final int hashCode() {
        String str = this.bizStatusMsg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        k kVar = this.pinedProduct;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Integer num = this.pinSecondDuration;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PinedProductsResponse(bizStatusMsg=");
        sbLIZ.append(this.bizStatusMsg);
        sbLIZ.append(", pinedProduct=");
        sbLIZ.append(this.pinedProduct);
        sbLIZ.append(", pinSecondDuration=");
        sbLIZ.append(this.pinSecondDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PinedProductsResponse(String str, k kVar, Integer num) {
        this.bizStatusMsg = str;
        this.pinedProduct = kVar;
        this.pinSecondDuration = num;
    }
}
