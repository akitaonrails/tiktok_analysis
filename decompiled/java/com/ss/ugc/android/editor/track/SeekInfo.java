package com.ss.ugc.android.editor.track;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class SeekInfo {
    public final boolean autoPlay;
    public final boolean isEnd;
    public final boolean isFromUser;
    public final long position;
    public final float seekDurationSpeed;
    public final int seekFlag;
    public final float seekPxSpeed;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeekInfo(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(this.autoPlay);
        sbLIZ.append(", seekFlag=");
        sbLIZ.append(this.seekFlag);
        sbLIZ.append(", seekPxSpeed=");
        sbLIZ.append(this.seekPxSpeed);
        sbLIZ.append(", seekDurationSpeed=");
        sbLIZ.append(this.seekDurationSpeed);
        sbLIZ.append(", isFromUser=");
        sbLIZ.append(this.isFromUser);
        sbLIZ.append(", isEnd=");
        sbLIZ.append(this.isEnd);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final boolean isFromUser() {
        return this.isFromUser;
    }

    public SeekInfo(long j, boolean z, int i, float f, float f2, boolean z2, boolean z3) {
        this.position = j;
        this.autoPlay = z;
        this.seekFlag = i;
        this.seekPxSpeed = f;
        this.seekDurationSpeed = f2;
        this.isFromUser = z2;
        this.isEnd = z3;
    }
}
