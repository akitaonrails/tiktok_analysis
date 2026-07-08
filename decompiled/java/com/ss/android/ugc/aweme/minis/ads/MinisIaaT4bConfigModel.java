package com.ss.android.ugc.aweme.minis.ads;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisIaaT4bConfigModel {

    @C09CT("close_button_delay_seconds")
    public final double closeButtonDelaySeconds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisIaaT4bConfigModel) && Double.compare(this.closeButtonDelaySeconds, ((MinisIaaT4bConfigModel) obj).closeButtonDelaySeconds) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.closeButtonDelaySeconds);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisIaaT4bConfigModel(closeButtonDelaySeconds=");
        sbLIZ.append(this.closeButtonDelaySeconds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MinisIaaT4bConfigModel() {
        this(0.0d);
    }

    public MinisIaaT4bConfigModel(double d) {
        this.closeButtonDelaySeconds = d;
    }
}
