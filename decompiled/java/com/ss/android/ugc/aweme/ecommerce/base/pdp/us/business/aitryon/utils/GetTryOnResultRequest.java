package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetTryOnResultRequest {

    @C09CT("tryon_product_list")
    public final List<TryOnProductInfo> tryOnProductList;

    @C09CT("tryon_type")
    public final Integer tryOnType;

    public GetTryOnResultRequest() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTryOnResultRequest)) {
            return false;
        }
        GetTryOnResultRequest getTryOnResultRequest = (GetTryOnResultRequest) obj;
        return Intrinsics.LJFF(this.tryOnType, getTryOnResultRequest.tryOnType) && Intrinsics.LJFF(this.tryOnProductList, getTryOnResultRequest.tryOnProductList);
    }

    public final int hashCode() {
        Integer num = this.tryOnType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<TryOnProductInfo> list = this.tryOnProductList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetTryOnResultRequest(tryOnType=");
        sbLIZ.append(this.tryOnType);
        sbLIZ.append(", tryOnProductList=");
        sbLIZ.append(this.tryOnProductList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetTryOnResultRequest(Integer num, List<TryOnProductInfo> list) {
        this.tryOnType = num;
        this.tryOnProductList = list;
    }
}
