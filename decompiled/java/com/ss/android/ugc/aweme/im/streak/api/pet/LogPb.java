package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class LogPb {

    @C09CT("impr_id")
    public final String imprId;

    public LogPb() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogPb(imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LogPb(String str) {
        this.imprId = str;
    }
}
