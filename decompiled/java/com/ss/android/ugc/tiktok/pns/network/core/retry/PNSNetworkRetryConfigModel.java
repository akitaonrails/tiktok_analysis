package com.ss.android.ugc.tiktok.pns.network.core.retry;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PNSNetworkRetryConfigModel {

    @C09CT("global_retry_delay_ms")
    public final long globalRetryDelayMillis;

    @C09CT("global_retry_enable")
    public final boolean globalRetryEnable;

    @C09CT("global_retry_num")
    public final int globalRetryNum;

    @C09CT("path_list")
    public final List<PNSNetworkRetryPathModel> pathList;

    @C09CT("retry_ttnet_error_code")
    public final List<Integer> retryTTNetErrorCodeList;

    public PNSNetworkRetryConfigModel() {
        this(false, 0, 0L, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSNetworkRetryConfigModel)) {
            return false;
        }
        PNSNetworkRetryConfigModel pNSNetworkRetryConfigModel = (PNSNetworkRetryConfigModel) obj;
        return this.globalRetryEnable == pNSNetworkRetryConfigModel.globalRetryEnable && this.globalRetryNum == pNSNetworkRetryConfigModel.globalRetryNum && this.globalRetryDelayMillis == pNSNetworkRetryConfigModel.globalRetryDelayMillis && Intrinsics.LJFF(this.retryTTNetErrorCodeList, pNSNetworkRetryConfigModel.retryTTNetErrorCodeList) && Intrinsics.LJFF(this.pathList, pNSNetworkRetryConfigModel.pathList);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.globalRetryEnable) * 31) + this.globalRetryNum) * 31) + C786410Ut5.Y2(this.globalRetryDelayMillis)) * 31) + this.retryTTNetErrorCodeList.hashCode()) * 31) + this.pathList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSNetworkRetryConfigModel(globalRetryEnable=");
        sbLIZ.append(this.globalRetryEnable);
        sbLIZ.append(", globalRetryNum=");
        sbLIZ.append(this.globalRetryNum);
        sbLIZ.append(", globalRetryDelayMillis=");
        sbLIZ.append(this.globalRetryDelayMillis);
        sbLIZ.append(", retryTTNetErrorCodeList=");
        sbLIZ.append(this.retryTTNetErrorCodeList);
        sbLIZ.append(", pathList=");
        sbLIZ.append(this.pathList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSNetworkRetryConfigModel(boolean z, int i, long j, List<Integer> list, List<PNSNetworkRetryPathModel> list2) {
        this.globalRetryEnable = z;
        this.globalRetryNum = i;
        this.globalRetryDelayMillis = j;
        this.retryTTNetErrorCodeList = list;
        this.pathList = list2;
    }

    public PNSNetworkRetryConfigModel(boolean z, int i, long j, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? i : 0, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
