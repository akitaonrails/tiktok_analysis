package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.Extra;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveBubbleExtra extends Extra implements Serializable {

    @C09CT("log_pb")
    public LogPb logPb;

    public LiveBubbleExtra() {
        this(null);
    }

    public final LiveBubbleExtra copy(LogPb logPb) {
        return new LiveBubbleExtra(logPb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveBubbleExtra) && Intrinsics.LJFF(this.logPb, ((LiveBubbleExtra) obj).logPb);
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
        sbLIZ.append("LiveBubbleExtra(logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final LogPb getLogPb() {
        return this.logPb;
    }

    public LiveBubbleExtra(LogPb logPb) {
        this.logPb = logPb;
    }

    public final void setLogPb(LogPb logPb) {
        this.logPb = logPb;
    }
}
