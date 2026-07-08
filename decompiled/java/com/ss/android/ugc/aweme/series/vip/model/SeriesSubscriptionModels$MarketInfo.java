package com.ss.android.ugc.aweme.series.vip.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SeriesSubscriptionModels$MarketInfo {

    @C09CT("voncher_id")
    public final String voucherId;

    public SeriesSubscriptionModels$MarketInfo() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeriesSubscriptionModels$MarketInfo) && Intrinsics.LJFF(this.voucherId, ((SeriesSubscriptionModels$MarketInfo) obj).voucherId);
    }

    public final int hashCode() {
        String str = this.voucherId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarketInfo(voucherId=");
        sbLIZ.append(this.voucherId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeriesSubscriptionModels$MarketInfo(String str) {
        this.voucherId = str;
    }
}
