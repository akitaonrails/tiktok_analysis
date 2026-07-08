package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRTCUser;

/* JADX INFO: loaded from: classes21.dex */
public class RtcUser {
    public String metaData;
    public String userId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RtcUser{uid='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", metaData='");
        sbLIZ.append(this.metaData);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RtcUser() {
    }

    public RtcUser(InternalRTCUser internalRTCUser) {
        this.userId = internalRTCUser.userId;
        this.metaData = internalRTCUser.metaData;
    }
}
