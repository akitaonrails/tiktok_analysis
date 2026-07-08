package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCInfoExtra {

    @C09CT("version")
    public String version;

    public RTCInfoExtra() {
        this(null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCInfoExtra(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCInfoExtra(String str) {
        this.version = str;
    }
}
