package com.ss.android.ugc.aweme.share;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes29.dex */
public final class ClientScopeResponse {

    @C09CT("data")
    public final ScopeData data;

    @C09CT("message")
    public final String message;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClientScopeResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ClientScopeResponse(ScopeData scopeData, String str) {
        this.data = scopeData;
        this.message = str;
    }
}
