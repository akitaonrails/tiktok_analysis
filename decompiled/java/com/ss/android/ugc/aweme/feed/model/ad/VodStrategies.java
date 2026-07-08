package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VodStrategies implements Serializable {

    @C09CT("super_resolution_priority")
    public final Integer superResolutionPriority;

    public VodStrategies() {
        this(null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VodStrategies(superResolutionPriority=");
        sbLIZ.append(this.superResolutionPriority);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VodStrategies(Integer num) {
        this.superResolutionPriority = num;
    }
}
