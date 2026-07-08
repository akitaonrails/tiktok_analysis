package com.ss.android.ugc.aweme.minis.request.payment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisPayBeansRequest {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("flow_id")
    public final String flowId;

    @C09CT("is_debug_mode")
    public final boolean isDebugMode;

    @C09CT("minis_stage")
    public final int minisStage;

    @C09CT("tracking_extra")
    public final Map<String, String> trackingExtra;

    @C09CT("tracking_id")
    public final String trackingId;

    @C09CT("trade_order_id")
    public final String tradeOrderId;

    public MinisPayBeansRequest() {
        this("", "", "", "", 0, "", false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisPayBeansRequest)) {
            return false;
        }
        MinisPayBeansRequest minisPayBeansRequest = (MinisPayBeansRequest) obj;
        return Intrinsics.LJFF(this.tradeOrderId, minisPayBeansRequest.tradeOrderId) && Intrinsics.LJFF(this.enterFrom, minisPayBeansRequest.enterFrom) && Intrinsics.LJFF(this.flowId, minisPayBeansRequest.flowId) && Intrinsics.LJFF(this.trackingId, minisPayBeansRequest.trackingId) && this.minisStage == minisPayBeansRequest.minisStage && Intrinsics.LJFF(this.clientKey, minisPayBeansRequest.clientKey) && this.isDebugMode == minisPayBeansRequest.isDebugMode && Intrinsics.LJFF(this.trackingExtra, minisPayBeansRequest.trackingExtra);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.tradeOrderId.hashCode() * 31) + this.enterFrom.hashCode()) * 31) + this.flowId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + this.minisStage) * 31) + this.clientKey.hashCode()) * 31) + C786410Ut5.Z2(this.isDebugMode)) * 31;
        Map<String, String> map = this.trackingExtra;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisPayBeansRequest(tradeOrderId=");
        sbLIZ.append(this.tradeOrderId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", flowId=");
        sbLIZ.append(this.flowId);
        sbLIZ.append(", trackingId=");
        sbLIZ.append(this.trackingId);
        sbLIZ.append(", minisStage=");
        sbLIZ.append(this.minisStage);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", isDebugMode=");
        sbLIZ.append(this.isDebugMode);
        sbLIZ.append(", trackingExtra=");
        sbLIZ.append(this.trackingExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisPayBeansRequest(String str, String str2, String str3, String str4, int i, String str5, boolean z, Map<String, String> map) {
        this.tradeOrderId = str;
        this.enterFrom = str2;
        this.flowId = str3;
        this.trackingId = str4;
        this.minisStage = i;
        this.clientKey = str5;
        this.isDebugMode = z;
        this.trackingExtra = map;
    }
}
