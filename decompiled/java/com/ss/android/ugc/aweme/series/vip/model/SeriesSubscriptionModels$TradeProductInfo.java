package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesSubscriptionModels$TradeProductInfo {

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("spu_id")
    public final String spuId;

    public SeriesSubscriptionModels$TradeProductInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$TradeProductInfo)) {
            return false;
        }
        SeriesSubscriptionModels$TradeProductInfo seriesSubscriptionModels$TradeProductInfo = (SeriesSubscriptionModels$TradeProductInfo) obj;
        return Intrinsics.LJFF(this.spuId, seriesSubscriptionModels$TradeProductInfo.spuId) && Intrinsics.LJFF(this.skuId, seriesSubscriptionModels$TradeProductInfo.skuId);
    }

    public final int hashCode() {
        String str = this.spuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeProductInfo(spuId=");
        sbLIZ.append(this.spuId);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$TradeProductInfo(String str, String str2) {
        this.spuId = str;
        this.skuId = str2;
    }
}
