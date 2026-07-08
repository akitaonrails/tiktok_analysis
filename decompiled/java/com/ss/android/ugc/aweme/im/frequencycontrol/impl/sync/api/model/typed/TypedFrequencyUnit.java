package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model.typed;

import X.C053W;
import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTriggerEnum;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TypedFrequencyUnit implements Serializable {

    @C09CT("rules")
    public final List<C053W> rules;

    @C09CT("trigger")
    public final ImFrequencyTriggerEnum trigger;

    public TypedFrequencyUnit() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedFrequencyUnit)) {
            return false;
        }
        TypedFrequencyUnit typedFrequencyUnit = (TypedFrequencyUnit) obj;
        return this.trigger == typedFrequencyUnit.trigger && Intrinsics.LJFF(this.rules, typedFrequencyUnit.rules);
    }

    public int hashCode() {
        ImFrequencyTriggerEnum imFrequencyTriggerEnum = this.trigger;
        int iHashCode = (imFrequencyTriggerEnum == null ? 0 : imFrequencyTriggerEnum.hashCode()) * 31;
        List<C053W> list = this.rules;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypedFrequencyUnit(trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TypedFrequencyUnit(ImFrequencyTriggerEnum imFrequencyTriggerEnum, List<C053W> list) {
        this.trigger = imFrequencyTriggerEnum;
        this.rules = list;
    }
}
