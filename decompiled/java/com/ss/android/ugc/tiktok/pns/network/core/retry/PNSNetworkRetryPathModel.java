package com.ss.android.ugc.tiktok.pns.network.core.retry;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PNSNetworkRetryPathModel {

    @C09CT("path")
    public final String path;

    @C09CT("retry_delay_ms")
    public final Long retryDelayMillis;

    @C09CT("retry_num")
    public final Integer retryNum;

    public PNSNetworkRetryPathModel() {
        this("", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSNetworkRetryPathModel)) {
            return false;
        }
        PNSNetworkRetryPathModel pNSNetworkRetryPathModel = (PNSNetworkRetryPathModel) obj;
        return Intrinsics.LJFF(this.path, pNSNetworkRetryPathModel.path) && Intrinsics.LJFF(this.retryNum, pNSNetworkRetryPathModel.retryNum) && Intrinsics.LJFF(this.retryDelayMillis, pNSNetworkRetryPathModel.retryDelayMillis);
    }

    public final int hashCode() {
        int iHashCode = this.path.hashCode() * 31;
        Integer num = this.retryNum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.retryDelayMillis;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSNetworkRetryPathModel(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", retryNum=");
        sbLIZ.append(this.retryNum);
        sbLIZ.append(", retryDelayMillis=");
        sbLIZ.append(this.retryDelayMillis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSNetworkRetryPathModel(String str, Integer num, Long l) {
        this.path = str;
        this.retryNum = num;
        this.retryDelayMillis = l;
    }
}
