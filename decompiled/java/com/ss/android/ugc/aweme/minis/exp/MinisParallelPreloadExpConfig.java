package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisParallelPreloadExpConfig implements Serializable {

    @C09CT("no_wifi_size")
    public final int noWifiSize;

    @C09CT("strategy")
    public final int strategy;

    @C09CT("wifi_size")
    public final int wifiSize;

    public MinisParallelPreloadExpConfig() {
        this(0, 5120, 10240);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisParallelPreloadExpConfig)) {
            return false;
        }
        MinisParallelPreloadExpConfig minisParallelPreloadExpConfig = (MinisParallelPreloadExpConfig) obj;
        return this.strategy == minisParallelPreloadExpConfig.strategy && this.noWifiSize == minisParallelPreloadExpConfig.noWifiSize && this.wifiSize == minisParallelPreloadExpConfig.wifiSize;
    }

    public int hashCode() {
        return (((this.strategy * 31) + this.noWifiSize) * 31) + this.wifiSize;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisParallelPreloadExpConfig(strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(", noWifiSize=");
        sbLIZ.append(this.noWifiSize);
        sbLIZ.append(", wifiSize=");
        sbLIZ.append(this.wifiSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisParallelPreloadExpConfig(int i, int i2, int i3) {
        this.strategy = i;
        this.noWifiSize = i2;
        this.wifiSize = i3;
    }
}
