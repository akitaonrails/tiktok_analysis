package com.ss.android.ugc.aweme.perf;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingLowMemTrimV2Config {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("leave_tab_delay_ms")
    public final long leaveTabDelayMs;

    @C09CT("trigger")
    public final int trigger;

    public FollowingLowMemTrimV2Config() {
        this(false, 0, 500L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowingLowMemTrimV2Config)) {
            return false;
        }
        FollowingLowMemTrimV2Config followingLowMemTrimV2Config = (FollowingLowMemTrimV2Config) obj;
        return this.enable == followingLowMemTrimV2Config.enable && this.trigger == followingLowMemTrimV2Config.trigger && this.leaveTabDelayMs == followingLowMemTrimV2Config.leaveTabDelayMs;
    }

    public int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.trigger) * 31) + C786410Ut5.Y2(this.leaveTabDelayMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowingLowMemTrimV2Config(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", leaveTabDelayMs=");
        sbLIZ.append(this.leaveTabDelayMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FollowingLowMemTrimV2Config(boolean z, int i, long j) {
        this.enable = z;
        this.trigger = i;
        this.leaveTabDelayMs = j;
    }
}
