package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyData implements Serializable {

    @C09CT("counters")
    public final List<FrequencyCounterEntry> counters;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    public FrequencyData() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyData)) {
            return false;
        }
        FrequencyData frequencyData = (FrequencyData) obj;
        return Intrinsics.LJFF(this.id, frequencyData.id) && Intrinsics.LJFF(this.counters, frequencyData.counters);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FrequencyCounterEntry> list = this.counters;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyData(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", counters=");
        sbLIZ.append(this.counters);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyData(String str, List<FrequencyCounterEntry> list) {
        this.id = str;
        this.counters = list;
    }
}
