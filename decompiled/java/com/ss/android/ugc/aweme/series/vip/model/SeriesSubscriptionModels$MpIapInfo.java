package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class SeriesSubscriptionModels$MpIapInfo {

    @C09CT("app_store_region")
    public final String appStoreRegion;

    @C09CT("client_param")
    public final String clientParam;

    @C09CT("risk_info")
    public final String riskInfo;

    public SeriesSubscriptionModels$MpIapInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$MpIapInfo)) {
            return false;
        }
        SeriesSubscriptionModels$MpIapInfo seriesSubscriptionModels$MpIapInfo = (SeriesSubscriptionModels$MpIapInfo) obj;
        return Intrinsics.LJFF(this.appStoreRegion, seriesSubscriptionModels$MpIapInfo.appStoreRegion) && Intrinsics.LJFF(this.riskInfo, seriesSubscriptionModels$MpIapInfo.riskInfo) && Intrinsics.LJFF(this.clientParam, seriesSubscriptionModels$MpIapInfo.clientParam);
    }

    public final int hashCode() {
        String str = this.appStoreRegion;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.riskInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientParam;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MpIapInfo(appStoreRegion=");
        sbLIZ.append(this.appStoreRegion);
        sbLIZ.append(", riskInfo=");
        sbLIZ.append(this.riskInfo);
        sbLIZ.append(", clientParam=");
        sbLIZ.append(this.clientParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$MpIapInfo(String str, String str2, String str3) {
        this.appStoreRegion = str;
        this.riskInfo = str2;
        this.clientParam = str3;
    }
}
