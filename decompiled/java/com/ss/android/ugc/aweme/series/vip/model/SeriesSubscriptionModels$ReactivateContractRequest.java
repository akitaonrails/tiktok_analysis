package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class SeriesSubscriptionModels$ReactivateContractRequest {

    @C09CT("contract_id")
    public final String contractId;

    @C09CT("et_info")
    public final SeriesSubscriptionModels$TradeETInfo etInfo;

    @C09CT("iap_info")
    public final SeriesSubscriptionModels$MpIapInfo iapInfo;

    public SeriesSubscriptionModels$ReactivateContractRequest() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$ReactivateContractRequest)) {
            return false;
        }
        SeriesSubscriptionModels$ReactivateContractRequest seriesSubscriptionModels$ReactivateContractRequest = (SeriesSubscriptionModels$ReactivateContractRequest) obj;
        return Intrinsics.LJFF(this.contractId, seriesSubscriptionModels$ReactivateContractRequest.contractId) && Intrinsics.LJFF(this.iapInfo, seriesSubscriptionModels$ReactivateContractRequest.iapInfo) && Intrinsics.LJFF(this.etInfo, seriesSubscriptionModels$ReactivateContractRequest.etInfo);
    }

    public final int hashCode() {
        String str = this.contractId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SeriesSubscriptionModels$MpIapInfo seriesSubscriptionModels$MpIapInfo = this.iapInfo;
        int iHashCode2 = (iHashCode + (seriesSubscriptionModels$MpIapInfo == null ? 0 : seriesSubscriptionModels$MpIapInfo.hashCode())) * 31;
        SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo = this.etInfo;
        return iHashCode2 + (seriesSubscriptionModels$TradeETInfo != null ? seriesSubscriptionModels$TradeETInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReactivateContractRequest(contractId=");
        sbLIZ.append(this.contractId);
        sbLIZ.append(", iapInfo=");
        sbLIZ.append(this.iapInfo);
        sbLIZ.append(", etInfo=");
        sbLIZ.append(this.etInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$ReactivateContractRequest(String str, SeriesSubscriptionModels$MpIapInfo seriesSubscriptionModels$MpIapInfo, SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo) {
        this.contractId = str;
        this.iapInfo = seriesSubscriptionModels$MpIapInfo;
        this.etInfo = seriesSubscriptionModels$TradeETInfo;
    }
}
