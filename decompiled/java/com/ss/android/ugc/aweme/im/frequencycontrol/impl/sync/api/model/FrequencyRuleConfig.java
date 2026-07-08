package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyRuleConfig implements Serializable {

    @C09CT("times")
    public final Long times;

    @C09CT("type")
    public final Integer type;

    @C09CT("valid_time")
    public final Long validTime;

    public FrequencyRuleConfig() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyRuleConfig)) {
            return false;
        }
        FrequencyRuleConfig frequencyRuleConfig = (FrequencyRuleConfig) obj;
        return Intrinsics.LJFF(this.type, frequencyRuleConfig.type) && Intrinsics.LJFF(this.times, frequencyRuleConfig.times) && Intrinsics.LJFF(this.validTime, frequencyRuleConfig.validTime);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.times;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.validTime;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyRuleConfig(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", times=");
        sbLIZ.append(this.times);
        sbLIZ.append(", validTime=");
        sbLIZ.append(this.validTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyRuleConfig(Integer num, Long l, Long l2) {
        this.type = num;
        this.times = l;
        this.validTime = l2;
    }
}
