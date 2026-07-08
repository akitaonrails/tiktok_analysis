package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyCounterEntry implements Serializable {

    @C09CT("counter")
    public final FrequencyCounter counter;

    @C09CT("trigger")
    public final Integer trigger;

    public FrequencyCounterEntry() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyCounterEntry)) {
            return false;
        }
        FrequencyCounterEntry frequencyCounterEntry = (FrequencyCounterEntry) obj;
        return Intrinsics.LJFF(this.trigger, frequencyCounterEntry.trigger) && Intrinsics.LJFF(this.counter, frequencyCounterEntry.counter);
    }

    public int hashCode() {
        Integer num = this.trigger;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        FrequencyCounter frequencyCounter = this.counter;
        return iHashCode + (frequencyCounter != null ? frequencyCounter.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyCounterEntry(trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", counter=");
        sbLIZ.append(this.counter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyCounterEntry(Integer num, FrequencyCounter frequencyCounter) {
        this.trigger = num;
        this.counter = frequencyCounter;
    }
}
