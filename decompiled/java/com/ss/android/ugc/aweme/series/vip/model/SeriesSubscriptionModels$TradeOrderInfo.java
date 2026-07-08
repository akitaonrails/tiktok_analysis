package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeriesSubscriptionModels$TradeOrderInfo {

    @C09CT("order_id")
    public final String orderId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final SeriesSubscriptionModels$ShopOrderStatus status;

    public SeriesSubscriptionModels$TradeOrderInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$TradeOrderInfo)) {
            return false;
        }
        SeriesSubscriptionModels$TradeOrderInfo seriesSubscriptionModels$TradeOrderInfo = (SeriesSubscriptionModels$TradeOrderInfo) obj;
        return Intrinsics.LJFF(this.orderId, seriesSubscriptionModels$TradeOrderInfo.orderId) && this.status == seriesSubscriptionModels$TradeOrderInfo.status;
    }

    public final int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus = this.status;
        return iHashCode + (seriesSubscriptionModels$ShopOrderStatus != null ? seriesSubscriptionModels$ShopOrderStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeOrderInfo(orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$TradeOrderInfo(String str, SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus) {
        this.orderId = str;
        this.status = seriesSubscriptionModels$ShopOrderStatus;
    }
}
