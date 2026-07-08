package com.bytedance.pumbaa.base2.performance.sla.recovery;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TimeoutState {

    @C09CT("control_timeout_at_by_api_id")
    public final Map<String, Long> controlTimeoutAtByApiId;

    @C09CT("last_control_timeout_at")
    public final Long lastControlTimeoutAt;

    @C09CT("last_init_timeout_at")
    public final Long lastInitTimeoutAt;

    public TimeoutState() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeoutState)) {
            return false;
        }
        TimeoutState timeoutState = (TimeoutState) obj;
        return Intrinsics.LJFF(this.lastInitTimeoutAt, timeoutState.lastInitTimeoutAt) && Intrinsics.LJFF(this.lastControlTimeoutAt, timeoutState.lastControlTimeoutAt) && Intrinsics.LJFF(this.controlTimeoutAtByApiId, timeoutState.controlTimeoutAtByApiId);
    }

    public final int hashCode() {
        Long l = this.lastInitTimeoutAt;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.lastControlTimeoutAt;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map<String, Long> map = this.controlTimeoutAtByApiId;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeoutState(lastInitTimeoutAt=");
        sbLIZ.append(this.lastInitTimeoutAt);
        sbLIZ.append(", lastControlTimeoutAt=");
        sbLIZ.append(this.lastControlTimeoutAt);
        sbLIZ.append(", controlTimeoutAtByApiId=");
        sbLIZ.append(this.controlTimeoutAtByApiId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TimeoutState(Long l, Long l2, Map<String, Long> map) {
        this.lastInitTimeoutAt = l;
        this.lastControlTimeoutAt = l2;
        this.controlTimeoutAtByApiId = map;
    }
}
