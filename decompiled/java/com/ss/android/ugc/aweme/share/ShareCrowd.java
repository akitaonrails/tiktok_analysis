package com.ss.android.ugc.aweme.share;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class ShareCrowd {

    @C09CT("crowd_name")
    public final String crowdName;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareCrowd(crowdName=");
        sbLIZ.append(this.crowdName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShareCrowd() {
        this("");
    }

    public ShareCrowd(String str) {
        this.crowdName = str;
    }
}
