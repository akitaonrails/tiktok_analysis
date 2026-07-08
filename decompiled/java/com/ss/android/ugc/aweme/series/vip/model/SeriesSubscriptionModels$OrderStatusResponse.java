package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionModels$OrderStatusResponse {

    @C09CT("contract")
    public final SeriesSubscriptionModels$TradeContractInfo contract;

    @C09CT("order")
    public final SeriesSubscriptionModels$OrderStatus order;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SeriesSubscriptionModels$OrderStatusResponse() {
        this(0, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$OrderStatusResponse)) {
            return false;
        }
        SeriesSubscriptionModels$OrderStatusResponse seriesSubscriptionModels$OrderStatusResponse = (SeriesSubscriptionModels$OrderStatusResponse) obj;
        return this.statusCode == seriesSubscriptionModels$OrderStatusResponse.statusCode && Intrinsics.LJFF(this.statusMsg, seriesSubscriptionModels$OrderStatusResponse.statusMsg) && Intrinsics.LJFF(this.order, seriesSubscriptionModels$OrderStatusResponse.order) && Intrinsics.LJFF(this.contract, seriesSubscriptionModels$OrderStatusResponse.contract);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        SeriesSubscriptionModels$OrderStatus seriesSubscriptionModels$OrderStatus = this.order;
        int iHashCode2 = (iHashCode + (seriesSubscriptionModels$OrderStatus == null ? 0 : seriesSubscriptionModels$OrderStatus.hashCode())) * 31;
        SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo = this.contract;
        return iHashCode2 + (seriesSubscriptionModels$TradeContractInfo != null ? seriesSubscriptionModels$TradeContractInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderStatusResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", contract=");
        sbLIZ.append(this.contract);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$OrderStatusResponse(int i, String str, SeriesSubscriptionModels$OrderStatus seriesSubscriptionModels$OrderStatus, SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo) {
        this.statusCode = i;
        this.statusMsg = str;
        this.order = seriesSubscriptionModels$OrderStatus;
        this.contract = seriesSubscriptionModels$TradeContractInfo;
    }
}
