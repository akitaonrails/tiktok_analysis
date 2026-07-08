package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TradeQueryRequest {

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("device_id")
    public final String deviceId;

    @C09CT("is_biometry_supported")
    public final boolean isBiometrySupported;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("risk_info")
    public final String riskInfo;

    public TradeQueryRequest() {
        this("", null, "", "", "", "", false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeQueryRequest)) {
            return false;
        }
        TradeQueryRequest tradeQueryRequest = (TradeQueryRequest) obj;
        return Intrinsics.LJFF(this.paymentReference, tradeQueryRequest.paymentReference) && Intrinsics.LJFF(this.configuration, tradeQueryRequest.configuration) && Intrinsics.LJFF(this.merchantUserId, tradeQueryRequest.merchantUserId) && Intrinsics.LJFF(this.merchantId, tradeQueryRequest.merchantId) && Intrinsics.LJFF(this.riskInfo, tradeQueryRequest.riskInfo) && Intrinsics.LJFF(this.deviceId, tradeQueryRequest.deviceId) && this.isBiometrySupported == tradeQueryRequest.isBiometrySupported && Intrinsics.LJFF(this.pipoErrorCodeParams, tradeQueryRequest.pipoErrorCodeParams);
    }

    public final int hashCode() {
        int iHashCode = this.paymentReference.hashCode() * 31;
        Configuration configuration = this.configuration;
        int iHashCode2 = (((((((((((iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31) + this.merchantUserId.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.riskInfo.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + C786410Ut5.Z2(this.isBiometrySupported)) * 31;
        String str = this.pipoErrorCodeParams;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeQueryRequest(paymentReference=");
        sbLIZ.append(this.paymentReference);
        sbLIZ.append(", configuration=");
        sbLIZ.append(this.configuration);
        sbLIZ.append(", merchantUserId=");
        sbLIZ.append(this.merchantUserId);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.merchantId);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.riskInfo);
        sbLIZ.append(", deviceId=");
        sbLIZ.append(this.deviceId);
        sbLIZ.append(", isBiometrySupported=");
        sbLIZ.append(this.isBiometrySupported);
        sbLIZ.append(", pipoErrorCodeParams=");
        sbLIZ.append(this.pipoErrorCodeParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TradeQueryRequest(String str, Configuration configuration, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.paymentReference = str;
        this.configuration = configuration;
        this.merchantUserId = str2;
        this.merchantId = str3;
        this.riskInfo = str4;
        this.deviceId = str5;
        this.isBiometrySupported = z;
        this.pipoErrorCodeParams = str6;
    }
}
