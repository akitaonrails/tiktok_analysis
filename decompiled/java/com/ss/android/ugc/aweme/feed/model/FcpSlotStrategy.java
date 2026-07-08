package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpSlotStrategy implements Serializable {

    @C09CT("container_entrance_configs")
    public List<FcpSlotConfig> entranceConfigs;

    @C09CT("container_exit_configs")
    public List<FcpSlotConfig> exitConfigs;

    public FcpSlotStrategy() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FcpSlotStrategy)) {
            return false;
        }
        FcpSlotStrategy fcpSlotStrategy = (FcpSlotStrategy) obj;
        return Intrinsics.LJFF(this.entranceConfigs, fcpSlotStrategy.entranceConfigs) && Intrinsics.LJFF(this.exitConfigs, fcpSlotStrategy.exitConfigs);
    }

    public int hashCode() {
        List<FcpSlotConfig> list = this.entranceConfigs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FcpSlotConfig> list2 = this.exitConfigs;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpSlotStrategy(entranceConfigs=");
        sbLIZ.append(this.entranceConfigs);
        sbLIZ.append(", exitConfigs=");
        sbLIZ.append(this.exitConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FcpSlotStrategy(List<FcpSlotConfig> list, List<FcpSlotConfig> list2) {
        this.entranceConfigs = list;
        this.exitConfigs = list2;
    }
}
