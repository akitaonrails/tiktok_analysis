package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkUniversalPopupLogResponse implements Serializable {

    @C09CT("impr_id")
    public final String imprId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkUniversalPopupLogResponse(imprId=");
        sbLIZ.append(this.imprId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkUniversalPopupLogResponse() {
        this("");
    }

    public NetworkUniversalPopupLogResponse(String str) {
        this.imprId = str;
    }
}
