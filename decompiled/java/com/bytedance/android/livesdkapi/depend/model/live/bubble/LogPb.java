package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class LogPb implements Serializable {

    @C09CT("impr_id")
    public String imprId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogPb(imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LogPb() {
        this("");
    }

    public LogPb(String str) {
        this.imprId = str;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }
}
