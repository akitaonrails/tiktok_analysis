package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.Extra;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BubbleSettingExtra extends Extra implements Serializable {

    @C09CT("log_pb")
    public LogPb logPb;

    public BubbleSettingExtra() {
        this(null);
    }

    public final BubbleSettingExtra copy(LogPb logPb) {
        return new BubbleSettingExtra(logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BubbleSettingExtra) && Intrinsics.LJFF(this.logPb, ((BubbleSettingExtra) obj).logPb);
    }

    public int hashCode() {
        LogPb logPb = this.logPb;
        if (logPb == null) {
            return 0;
        }
        return logPb.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleSettingExtra(logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public BubbleSettingExtra(LogPb logPb) {
        this.logPb = logPb;
    }

    public final void setLogPb(LogPb logPb) {
        this.logPb = logPb;
    }
}
