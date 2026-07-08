package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class RtcStartResultMessage {
    public final LinkCoreError error;
    public final boolean startSuccess;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RtcStartResultMessage(startSuccess=");
        sbLIZ.append(this.startSuccess);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RtcStartResultMessage(boolean z, LinkCoreError linkCoreError) {
        this.startSuccess = z;
        this.error = linkCoreError;
    }
}
