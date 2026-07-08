package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class MicPositionInfo {
    public String contentLinkMicId;
    public int contentType;
    public long linkedTime;
    public final int position;
    public final int strategy;
    public int uiPos;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MicPositionInfo(strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", uiPos=");
        sbLIZ.append(this.uiPos);
        sbLIZ.append(", linkedTime=");
        sbLIZ.append(this.linkedTime);
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

    public final void setLinkedTime(long j) {
        this.linkedTime = j;
    }

    public final void setUiPos(int i) {
        this.uiPos = i;
    }

    public MicPositionInfo(int i, int i2, int i3, long j, int i4, String str) {
        this.strategy = i;
        this.position = i2;
        this.uiPos = i3;
        this.linkedTime = j;
        this.contentType = i4;
        this.contentLinkMicId = str;
    }
}
