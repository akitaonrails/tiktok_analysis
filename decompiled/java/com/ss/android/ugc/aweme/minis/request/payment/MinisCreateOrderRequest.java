package com.ss.android.ugc.aweme.minis.request.payment;

import X.C09CT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisCreateOrderRequest {

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

    @C09CT("pay_region")
    public final String payRegion;

    @C09CT("pay_type")
    public final String payType;

    @C09CT("tier_id")
    public final String tierId;

    @C09CT("token_type")
    public final String tokenType;

    @C09CT("tracking_extra")
    public final Map<String, String> trackingExtra;

    @C09CT("tracking_id")
    public final String trackingId;

    public MinisCreateOrderRequest() {
        this("", "", "", "", "", "", "", 0, "", false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisCreateOrderRequest)) {
            return false;
        }
        MinisCreateOrderRequest minisCreateOrderRequest = (MinisCreateOrderRequest) obj;
        return Intrinsics.LJFF(this.tierId, minisCreateOrderRequest.tierId) && Intrinsics.LJFF(this.tokenType, minisCreateOrderRequest.tokenType) && Intrinsics.LJFF(this.payRegion, minisCreateOrderRequest.payRegion) && Intrinsics.LJFF(this.clientKey, minisCreateOrderRequest.clientKey) && Intrinsics.LJFF(this.enterFrom, minisCreateOrderRequest.enterFrom) && Intrinsics.LJFF(this.flowId, minisCreateOrderRequest.flowId) && Intrinsics.LJFF(this.trackingId, minisCreateOrderRequest.trackingId) && this.minisStage == minisCreateOrderRequest.minisStage && Intrinsics.LJFF(this.payType, minisCreateOrderRequest.payType) && this.isDebugMode == minisCreateOrderRequest.isDebugMode && Intrinsics.LJFF(this.trackingExtra, minisCreateOrderRequest.trackingExtra);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.tierId.hashCode() * 31) + this.tokenType.hashCode()) * 31) + this.payRegion.hashCode()) * 31) + this.clientKey.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.flowId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + this.minisStage) * 31) + this.payType.hashCode()) * 31) + C786410Ut5.Z2(this.isDebugMode)) * 31;
        Map<String, String> map = this.trackingExtra;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "MinisCreateOrderRequest(tierId=" + this.tierId + ", tokenType=" + this.tokenType + ", payRegion=" + this.payRegion + ", clientKey=" + this.clientKey + ", enterFrom=" + this.enterFrom + ", flowId=" + this.flowId + ", trackingId=" + this.trackingId + ", minisStage=" + this.minisStage + ", payType=" + this.payType + ", isDebugMode=" + this.isDebugMode + ", trackingExtra=" + this.trackingExtra + ')';
    }

    public MinisCreateOrderRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, boolean z, Map<String, String> map) {
        this.tierId = str;
        this.tokenType = str2;
        this.payRegion = str3;
        this.clientKey = str4;
        this.enterFrom = str5;
        this.flowId = str6;
        this.trackingId = str7;
        this.minisStage = i;
        this.payType = str8;
        this.isDebugMode = z;
        this.trackingExtra = map;
    }
}
