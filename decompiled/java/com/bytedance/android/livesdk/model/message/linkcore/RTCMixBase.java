package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCMixBase {

    @C09CT("bitrate")
    public int bitrate;

    public RTCMixBase() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCMixBase(bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCMixBase(int i) {
        this.bitrate = i;
    }
}
