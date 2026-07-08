package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class InternalRTCUser {
    public String metaData;
    public String userId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalRtcUser{userId='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", metaData='");
        sbLIZ.append(this.metaData);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalRTCUser(String str, String str2) {
        this.userId = str;
        this.metaData = str2;
    }

    public static InternalRTCUser create(String str, String str2) {
        return new InternalRTCUser(str, str2);
    }
}
