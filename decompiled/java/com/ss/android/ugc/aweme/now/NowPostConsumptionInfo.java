package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowPostConsumptionInfo implements Serializable {

    @C09CT("blur_type")
    public int blurType;

    @C09CT("forced_visibility")
    public NowForcedVisibility nowForcedVisibility;

    public NowPostConsumptionInfo() {
        this(null, 0);
    }

    public NowPostConsumptionInfo(NowForcedVisibility nowForcedVisibility, int i) {
        this.nowForcedVisibility = nowForcedVisibility;
        this.blurType = i;
    }
}
