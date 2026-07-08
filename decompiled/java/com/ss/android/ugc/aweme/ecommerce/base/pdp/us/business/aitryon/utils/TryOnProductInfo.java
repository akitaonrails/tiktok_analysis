package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TryOnProductInfo {

    @C09CT("product_id")
    public final String productId;

    @C09CT("sale_prop")
    public final SkuSaleProp saleProp;

    @C09CT("sku_id")
    public final String skuId;

    public TryOnProductInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TryOnProductInfo)) {
            return false;
        }
        TryOnProductInfo tryOnProductInfo = (TryOnProductInfo) obj;
        return Intrinsics.LJFF(this.productId, tryOnProductInfo.productId) && Intrinsics.LJFF(this.skuId, tryOnProductInfo.skuId) && Intrinsics.LJFF(this.saleProp, tryOnProductInfo.saleProp);
    }

    public final int hashCode() {
        String str = this.productId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SkuSaleProp skuSaleProp = this.saleProp;
        return iHashCode2 + (skuSaleProp != null ? skuSaleProp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnProductInfo(productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", saleProp=");
        sbLIZ.append(this.saleProp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TryOnProductInfo(String str, String str2, SkuSaleProp skuSaleProp) {
        this.productId = str;
        this.skuId = str2;
        this.saleProp = skuSaleProp;
    }
}
