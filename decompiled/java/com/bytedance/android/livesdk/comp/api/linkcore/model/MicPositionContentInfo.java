package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MicPositionContentInfo {
    public String contentLinkMicId;
    public int contentType;
    public int position;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicPositionContentInfo)) {
            return false;
        }
        MicPositionContentInfo micPositionContentInfo = (MicPositionContentInfo) obj;
        return this.position == micPositionContentInfo.position && this.contentType == micPositionContentInfo.contentType && Intrinsics.LJFF(this.contentLinkMicId, micPositionContentInfo.contentLinkMicId);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MicPositionContentInfo(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", contentLinkMicId=");
        sbLIZ.append(this.contentLinkMicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setContentLinkMicId(String str) {
        this.contentLinkMicId = str;
    }

    public final void setContentType(int i) {
        this.contentType = i;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public MicPositionContentInfo(int i, int i2, String str) {
        this.position = i;
        this.contentType = i2;
        this.contentLinkMicId = str;
    }
}
