package com.ss.lyrax.video;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoFrameInfo {
    public int height;
    public LyraxVideoRotation rotation;
    public long timestampMs;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxVideoFrameInfo { width='");
        sbLIZ.append(this.width);
        sbLIZ.append('\'');
        sbLIZ.append(" height= '");
        sbLIZ.append(this.height);
        sbLIZ.append('\'');
        sbLIZ.append(" rotation: '");
        sbLIZ.append(this.rotation.toString());
        sbLIZ.append('\'');
        sbLIZ.append(" timestampMs: '");
        sbLIZ.append(this.timestampMs);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxVideoFrameInfo(int i, int i2, LyraxVideoRotation lyraxVideoRotation, long j) {
        this.width = i;
        this.height = i2;
        this.rotation = lyraxVideoRotation;
        this.timestampMs = j;
    }
}
