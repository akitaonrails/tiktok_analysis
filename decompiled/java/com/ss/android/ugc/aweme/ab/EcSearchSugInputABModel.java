package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSugInputABModel {

    @C09CT("duration_ms")
    public final long durationMs;

    @C09CT("enable")
    public final boolean enable;

    public EcSearchSugInputABModel() {
        this(false, 500L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcSearchSugInputABModel)) {
            return false;
        }
        EcSearchSugInputABModel ecSearchSugInputABModel = (EcSearchSugInputABModel) obj;
        return this.enable == ecSearchSugInputABModel.enable && this.durationMs == ecSearchSugInputABModel.durationMs;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.durationMs);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSugInputABModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcSearchSugInputABModel(boolean z, long j) {
        this.enable = z;
        this.durationMs = j;
    }
}
