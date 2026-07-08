package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class WeakNetworkOptConfig {
    public static final int $stable = 0;

    @C09CT("conv_list")
    public final ConvListOptConfig convList;

    @C09CT("history")
    public final HistoryOptConfig history;

    @C09CT("sug")
    public final SugOptConfig sug;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeakNetworkOptConfig)) {
            return false;
        }
        WeakNetworkOptConfig weakNetworkOptConfig = (WeakNetworkOptConfig) obj;
        return Intrinsics.LJFF(this.sug, weakNetworkOptConfig.sug) && Intrinsics.LJFF(this.convList, weakNetworkOptConfig.convList) && Intrinsics.LJFF(this.history, weakNetworkOptConfig.history);
    }

    public int hashCode() {
        return (((this.sug.hashCode() * 31) + this.convList.hashCode()) * 31) + this.history.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WeakNetworkOptConfig(sug=");
        sbLIZ.append(this.sug);
        sbLIZ.append(", convList=");
        sbLIZ.append(this.convList);
        sbLIZ.append(", history=");
        sbLIZ.append(this.history);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WeakNetworkOptConfig() {
        this(new SugOptConfig(new SkeletonOptConfig(false, false, 0), 0L), new ConvListOptConfig(new SkeletonOptConfig(false, false, 0), new RefreshLoadingConfig(false, 0L), 0L), new HistoryOptConfig(false, 0L));
    }

    public WeakNetworkOptConfig(SugOptConfig sugOptConfig, ConvListOptConfig convListOptConfig, HistoryOptConfig historyOptConfig) {
        this.sug = sugOptConfig;
        this.convList = convListOptConfig;
        this.history = historyOptConfig;
    }
}
