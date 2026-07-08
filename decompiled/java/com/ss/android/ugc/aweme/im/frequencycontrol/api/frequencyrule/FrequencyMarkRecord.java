package com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyMarkRecord {
    public static final FrequencyMarkRecord LIZ = new FrequencyMarkRecord(0, 0L, C13BV.INSTANCE, null, 8, null);

    @C09CT("count")
    public final Integer count;

    @C09CT("hit_timestamps")
    public final List<Long> hitTimestamps;

    @C09CT("last_show_time_ms")
    public final Long lastShowTimeMs;

    @C09CT("pending_client_override")
    public final Boolean pendingClientOverride;

    public FrequencyMarkRecord() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyMarkRecord)) {
            return false;
        }
        FrequencyMarkRecord frequencyMarkRecord = (FrequencyMarkRecord) obj;
        return Intrinsics.LJFF(this.count, frequencyMarkRecord.count) && Intrinsics.LJFF(this.lastShowTimeMs, frequencyMarkRecord.lastShowTimeMs) && Intrinsics.LJFF(this.hitTimestamps, frequencyMarkRecord.hitTimestamps) && Intrinsics.LJFF(this.pendingClientOverride, frequencyMarkRecord.pendingClientOverride);
    }

    public final int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.lastShowTimeMs;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<Long> list = this.hitTimestamps;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.pendingClientOverride;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyMarkRecord(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", lastShowTimeMs=");
        sbLIZ.append(this.lastShowTimeMs);
        sbLIZ.append(", hitTimestamps=");
        sbLIZ.append(this.hitTimestamps);
        sbLIZ.append(", pendingClientOverride=");
        sbLIZ.append(this.pendingClientOverride);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static FrequencyMarkRecord LIZ(FrequencyMarkRecord frequencyMarkRecord, Boolean bool) {
        Integer num = frequencyMarkRecord.count;
        Long l = frequencyMarkRecord.lastShowTimeMs;
        List<Long> list = frequencyMarkRecord.hitTimestamps;
        frequencyMarkRecord.getClass();
        return new FrequencyMarkRecord(num, l, list, bool);
    }

    public FrequencyMarkRecord(Integer num, Long l, List<Long> list, Boolean bool) {
        this.count = num;
        this.lastShowTimeMs = l;
        this.hitTimestamps = list;
        this.pendingClientOverride = bool;
    }

    public FrequencyMarkRecord(Integer num, Long l, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
