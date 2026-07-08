package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyCounter implements Serializable {

    @C09CT("client_override")
    public final Boolean clientOverride;

    @C09CT("count")
    public final Long count;

    @C09CT("hit_timestamps")
    public final List<Long> hitTimestamps;

    @C09CT("last_time")
    public final Long lastTime;

    public FrequencyCounter() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyCounter)) {
            return false;
        }
        FrequencyCounter frequencyCounter = (FrequencyCounter) obj;
        return Intrinsics.LJFF(this.count, frequencyCounter.count) && Intrinsics.LJFF(this.lastTime, frequencyCounter.lastTime) && Intrinsics.LJFF(this.hitTimestamps, frequencyCounter.hitTimestamps) && Intrinsics.LJFF(this.clientOverride, frequencyCounter.clientOverride);
    }

    public int hashCode() {
        Long l = this.count;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.lastTime;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<Long> list = this.hitTimestamps;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.clientOverride;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyCounter(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", lastTime=");
        sbLIZ.append(this.lastTime);
        sbLIZ.append(", hitTimestamps=");
        sbLIZ.append(this.hitTimestamps);
        sbLIZ.append(", clientOverride=");
        sbLIZ.append(this.clientOverride);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyCounter(Long l, Long l2, List<Long> list, Boolean bool) {
        this.count = l;
        this.lastTime = l2;
        this.hitTimestamps = list;
        this.clientOverride = bool;
    }
}
