package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class StyleConfig {

    @C09CT("output_count")
    public final int outputCount;

    @C09CT("style_id")
    public final long styleId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StyleConfig(styleId=");
        sbLIZ.append(this.styleId);
        sbLIZ.append(", outputCount=");
        sbLIZ.append(this.outputCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StyleConfig() {
        this(0L, 0);
    }

    public StyleConfig(long j, int i) {
        this.styleId = j;
        this.outputCount = i;
    }
}
