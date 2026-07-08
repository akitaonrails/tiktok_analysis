package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class SeiMultiCoHostStreamInfo {

    @C09CT("stream_status")
    public int streamStatus;

    public SeiMultiCoHostStreamInfo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeiMultiCoHostStreamInfo) && this.streamStatus == ((SeiMultiCoHostStreamInfo) obj).streamStatus;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiMultiCoHostStreamInfo(streamStatus=");
        sbLIZ.append(this.streamStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiMultiCoHostStreamInfo(int i) {
        this.streamStatus = i;
    }
}
