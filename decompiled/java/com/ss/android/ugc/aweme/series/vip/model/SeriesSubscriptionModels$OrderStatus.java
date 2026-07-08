package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeriesSubscriptionModels$OrderStatus {

    @C09CT("order_id")
    public final String orderId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final SeriesSubscriptionModels$ShopOrderStatus status;

    public SeriesSubscriptionModels$OrderStatus() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$OrderStatus)) {
            return false;
        }
        SeriesSubscriptionModels$OrderStatus seriesSubscriptionModels$OrderStatus = (SeriesSubscriptionModels$OrderStatus) obj;
        return this.status == seriesSubscriptionModels$OrderStatus.status && Intrinsics.LJFF(this.orderId, seriesSubscriptionModels$OrderStatus.orderId);
    }

    public final int hashCode() {
        SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus = this.status;
        int iHashCode = (seriesSubscriptionModels$ShopOrderStatus == null ? 0 : seriesSubscriptionModels$ShopOrderStatus.hashCode()) * 31;
        String str = this.orderId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderStatus(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", orderId=");
        sbLIZ.append(this.orderId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$OrderStatus(SeriesSubscriptionModels$ShopOrderStatus seriesSubscriptionModels$ShopOrderStatus, String str) {
        this.status = seriesSubscriptionModels$ShopOrderStatus;
        this.orderId = str;
    }
}
