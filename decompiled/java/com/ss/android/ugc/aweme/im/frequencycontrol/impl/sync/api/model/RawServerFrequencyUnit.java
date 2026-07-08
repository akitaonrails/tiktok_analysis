package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RawServerFrequencyUnit implements Serializable {

    @C09CT("rules")
    public final List<FrequencyRule> rules;

    @C09CT("trigger")
    public final Integer trigger;

    public RawServerFrequencyUnit() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawServerFrequencyUnit)) {
            return false;
        }
        RawServerFrequencyUnit rawServerFrequencyUnit = (RawServerFrequencyUnit) obj;
        return Intrinsics.LJFF(this.trigger, rawServerFrequencyUnit.trigger) && Intrinsics.LJFF(this.rules, rawServerFrequencyUnit.rules);
    }

    public int hashCode() {
        Integer num = this.trigger;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<FrequencyRule> list = this.rules;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RawServerFrequencyUnit(trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RawServerFrequencyUnit(Integer num, List<FrequencyRule> list) {
        this.trigger = num;
        this.rules = list;
    }
}
