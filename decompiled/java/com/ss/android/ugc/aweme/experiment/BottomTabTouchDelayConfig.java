package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class BottomTabTouchDelayConfig {

    @C09CT("delay_mills")
    public final long delayMills;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BottomTabTouchDelayConfig) && this.delayMills == ((BottomTabTouchDelayConfig) obj).delayMills;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.delayMills);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTabTouchDelayConfig(delayMills=");
        sbLIZ.append(this.delayMills);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomTabTouchDelayConfig() {
        this(0L);
    }

    public BottomTabTouchDelayConfig(long j) {
        this.delayMills = j;
    }
}
