package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SeriesSubscriptionModels$CreateContractResponse {

    @C09CT("contract_info")
    public final SeriesSubscriptionModels$TradeContractInfo contractInfo;

    @C09CT("iap_result")
    public final SeriesSubscriptionModels$MpIapResult iapResult;

    @C09CT("order")
    public final SeriesSubscriptionModels$TradeOrderInfo order;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SeriesSubscriptionModels$CreateContractResponse() {
        this(0, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$CreateContractResponse)) {
            return false;
        }
        SeriesSubscriptionModels$CreateContractResponse seriesSubscriptionModels$CreateContractResponse = (SeriesSubscriptionModels$CreateContractResponse) obj;
        return this.statusCode == seriesSubscriptionModels$CreateContractResponse.statusCode && Intrinsics.LJFF(this.statusMsg, seriesSubscriptionModels$CreateContractResponse.statusMsg) && Intrinsics.LJFF(this.contractInfo, seriesSubscriptionModels$CreateContractResponse.contractInfo) && Intrinsics.LJFF(this.order, seriesSubscriptionModels$CreateContractResponse.order) && Intrinsics.LJFF(this.iapResult, seriesSubscriptionModels$CreateContractResponse.iapResult);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo = this.contractInfo;
        int iHashCode2 = (iHashCode + (seriesSubscriptionModels$TradeContractInfo == null ? 0 : seriesSubscriptionModels$TradeContractInfo.hashCode())) * 31;
        SeriesSubscriptionModels$TradeOrderInfo seriesSubscriptionModels$TradeOrderInfo = this.order;
        int iHashCode3 = (iHashCode2 + (seriesSubscriptionModels$TradeOrderInfo == null ? 0 : seriesSubscriptionModels$TradeOrderInfo.hashCode())) * 31;
        SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult = this.iapResult;
        return iHashCode3 + (seriesSubscriptionModels$MpIapResult != null ? seriesSubscriptionModels$MpIapResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateContractResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", contractInfo=");
        sbLIZ.append(this.contractInfo);
        sbLIZ.append(", order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", iapResult=");
        sbLIZ.append(this.iapResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$CreateContractResponse(int i, String str, SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo, SeriesSubscriptionModels$TradeOrderInfo seriesSubscriptionModels$TradeOrderInfo, SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult) {
        this.statusCode = i;
        this.statusMsg = str;
        this.contractInfo = seriesSubscriptionModels$TradeContractInfo;
        this.order = seriesSubscriptionModels$TradeOrderInfo;
        this.iapResult = seriesSubscriptionModels$MpIapResult;
    }
}
