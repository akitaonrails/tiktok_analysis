package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class ByteRTCExtInfo {

    @C09CT("default_signaling_server_first")
    public int defaultSignaling;

    public ByteRTCExtInfo() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByteRTCExtInfo(defaultSignaling=");
        sbLIZ.append(this.defaultSignaling);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ByteRTCExtInfo(int i) {
        this.defaultSignaling = i;
    }
}
