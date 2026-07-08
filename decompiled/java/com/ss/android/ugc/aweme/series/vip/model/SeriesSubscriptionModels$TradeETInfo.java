package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class SeriesSubscriptionModels$TradeETInfo {

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("enter_source")
    public final String enterSource;

    @C09CT("extra")
    public final String extra;

    public SeriesSubscriptionModels$TradeETInfo() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesSubscriptionModels$TradeETInfo)) {
            return false;
        }
        SeriesSubscriptionModels$TradeETInfo seriesSubscriptionModels$TradeETInfo = (SeriesSubscriptionModels$TradeETInfo) obj;
        return Intrinsics.LJFF(this.enterSource, seriesSubscriptionModels$TradeETInfo.enterSource) && Intrinsics.LJFF(this.enterMethod, seriesSubscriptionModels$TradeETInfo.enterMethod) && Intrinsics.LJFF(this.extra, seriesSubscriptionModels$TradeETInfo.extra);
    }

    public final int hashCode() {
        String str = this.enterSource;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TradeETInfo(enterSource=");
        sbLIZ.append(this.enterSource);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$TradeETInfo(String str, String str2, String str3) {
        this.enterSource = str;
        this.enterMethod = str2;
        this.extra = str3;
    }
}
