package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SeriesSubscriptionModels$MpIapResult {

    @C09CT("in_app_request")
    public final String inAppRequest;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("web_payload")
    public final String webPayload;

    public SeriesSubscriptionModels$MpIapResult() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$MpIapResult)) {
            return false;
        }
        SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult = (SeriesSubscriptionModels$MpIapResult) obj;
        return Intrinsics.LJFF(this.inAppRequest, seriesSubscriptionModels$MpIapResult.inAppRequest) && Intrinsics.LJFF(this.redirectUrl, seriesSubscriptionModels$MpIapResult.redirectUrl) && Intrinsics.LJFF(this.webPayload, seriesSubscriptionModels$MpIapResult.webPayload);
    }

    public final int hashCode() {
        String str = this.inAppRequest;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.webPayload;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MpIapResult(inAppRequest=");
        sbLIZ.append(this.inAppRequest);
        sbLIZ.append(", redirectUrl=");
        sbLIZ.append(this.redirectUrl);
        sbLIZ.append(", webPayload=");
        sbLIZ.append(this.webPayload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$MpIapResult(String str, String str2, String str3) {
        this.inAppRequest = str;
        this.redirectUrl = str2;
        this.webPayload = str3;
    }
}
