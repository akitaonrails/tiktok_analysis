package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class SeriesSubscriptionModels$ChangePlanRequest {

    @C09CT("biz_line")
    public final SeriesSubscriptionModels$TradeBizLine bizLine;

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("et_info")
    public final SeriesSubscriptionModels$TradeETInfo etInfo;

    @C09CT("iap_info")
    public final SeriesSubscriptionModels$MpIapInfo iapInfo;

    @C09CT("product_info")
    public final SeriesSubscriptionModels$TradeProductInfo productInfo;

    public SeriesSubscriptionModels$ChangePlanRequest() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$ChangePlanRequest)) {
            return false;
        }
        SeriesSubscriptionModels$ChangePlanRequest seriesSubscriptionModels$ChangePlanRequest = (SeriesSubscriptionModels$ChangePlanRequest) obj;
        return Intrinsics.LJFF(this.productInfo, seriesSubscriptionModels$ChangePlanRequest.productInfo) && Intrinsics.LJFF(this.iapInfo, seriesSubscriptionModels$ChangePlanRequest.iapInfo) && Intrinsics.LJFF(this.etInfo, seriesSubscriptionModels$ChangePlanRequest.etInfo) && this.bizLine == seriesSubscriptionModels$ChangePlanRequest.bizLine && Intrinsics.LJFF(this.contractId, seriesSubscriptionModels$ChangePlanRequest.contractId);
    }

    public final int hashCode() {
        SeriesSubscriptionModels$TradeProductInfo seriesSubscriptionModels$TradeProductInfo = this.productInfo;
        int iHashCode = (seriesSubscriptionModels$TradeProductInfo == null ? 0 : seriesSubscriptionModels$TradeProductInfo.hashCode()) * 31;
        SeriesSubscriptionModels$MpIapInfo seriesSubscriptionModels$MpIapInfo = this.iapInfo;
        int iHashCode2 = (iHashCode + (seriesSubscriptionModels$MpIapInfo == null ? 0 : seriesSubscriptionModels$MpIapInfo.hashCode())) * 31;
        SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo = this.etInfo;
        int iHashCode3 = (iHashCode2 + (seriesSubscriptionModels$TradeETInfo == null ? 0 : seriesSubscriptionModels$TradeETInfo.hashCode())) * 31;
        SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine = this.bizLine;
        int iHashCode4 = (iHashCode3 + (seriesSubscriptionModels$TradeBizLine == null ? 0 : seriesSubscriptionModels$TradeBizLine.hashCode())) * 31;
        String str = this.contractId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangePlanRequest(productInfo=");
        sbLIZ.append(this.productInfo);
        sbLIZ.append(", iapInfo=");
        sbLIZ.append(this.iapInfo);
        sbLIZ.append(", etInfo=");
        sbLIZ.append(this.etInfo);
        sbLIZ.append(", bizLine=");
        sbLIZ.append(this.bizLine);
        sbLIZ.append(", contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$ChangePlanRequest(SeriesSubscriptionModels$TradeProductInfo seriesSubscriptionModels$TradeProductInfo, SeriesSubscriptionModels$MpIapInfo seriesSubscriptionModels$MpIapInfo, SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo, SeriesSubscriptionModels$TradeBizLine seriesSubscriptionModels$TradeBizLine, String str) {
        this.productInfo = seriesSubscriptionModels$TradeProductInfo;
        this.iapInfo = seriesSubscriptionModels$MpIapInfo;
        this.etInfo = seriesSubscriptionModels$TradeETInfo;
        this.bizLine = seriesSubscriptionModels$TradeBizLine;
        this.contractId = str;
    }
}
