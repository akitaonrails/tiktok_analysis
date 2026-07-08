package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class ExploreLowNetworkOptConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("low_network_load_cnt")
    public final int lowNetworkLoadCnt;

    @C09CT("low_network_quality")
    public final int lowNetworkQuality;

    public ExploreLowNetworkOptConfig() {
        this(false, 2, 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLowNetworkOptConfig)) {
            return false;
        }
        ExploreLowNetworkOptConfig exploreLowNetworkOptConfig = (ExploreLowNetworkOptConfig) obj;
        return this.isEnable == exploreLowNetworkOptConfig.isEnable && this.lowNetworkQuality == exploreLowNetworkOptConfig.lowNetworkQuality && this.lowNetworkLoadCnt == exploreLowNetworkOptConfig.lowNetworkLoadCnt;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.isEnable) * 31) + this.lowNetworkQuality) * 31) + this.lowNetworkLoadCnt;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLowNetworkOptConfig(isEnable=");
        sbLIZ.append(this.isEnable);
        sbLIZ.append(", lowNetworkQuality=");
        sbLIZ.append(this.lowNetworkQuality);
        sbLIZ.append(", lowNetworkLoadCnt=");
        sbLIZ.append(this.lowNetworkLoadCnt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public ExploreLowNetworkOptConfig(boolean z, int i, int i2) {
        this.isEnable = z;
        this.lowNetworkQuality = i;
        this.lowNetworkLoadCnt = i2;
    }
}
