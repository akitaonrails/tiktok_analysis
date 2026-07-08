package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class MinisParallelPreloadConfig implements Serializable {

    @C09CT("enable")
    public final boolean enable;

    public MinisParallelPreloadConfig() {
        this(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisParallelPreloadConfig) && this.enable == ((MinisParallelPreloadConfig) obj).enable;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.enable);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisParallelPreloadConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisParallelPreloadConfig(boolean z) {
        this.enable = z;
    }
}
