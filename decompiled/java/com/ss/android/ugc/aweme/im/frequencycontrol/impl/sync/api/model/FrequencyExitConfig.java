package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyExitConfig implements Serializable {

    @C09CT("type")
    public final Integer type;

    @C09CT("valid_time")
    public final Long validTime;

    public FrequencyExitConfig() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyExitConfig)) {
            return false;
        }
        FrequencyExitConfig frequencyExitConfig = (FrequencyExitConfig) obj;
        return Intrinsics.LJFF(this.type, frequencyExitConfig.type) && Intrinsics.LJFF(this.validTime, frequencyExitConfig.validTime);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.validTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyExitConfig(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", validTime=");
        sbLIZ.append(this.validTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyExitConfig(Integer num, Long l) {
        this.type = num;
        this.validTime = l;
    }
}
