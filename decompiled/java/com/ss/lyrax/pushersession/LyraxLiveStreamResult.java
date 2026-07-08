package com.ss.lyrax.pushersession;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxLiveStreamResult {
    public int targetFps;
    public int targetHeight;
    public int targetWidth;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxLiveStreamResult{targetWidth=");
        sbLIZ.append(this.targetWidth);
        sbLIZ.append(", targetHeight=");
        sbLIZ.append(this.targetHeight);
        sbLIZ.append(", targetFps=");
        sbLIZ.append(this.targetFps);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxLiveStreamResult() {
    }

    public LyraxLiveStreamResult(int i, int i2, int i3) {
        this.targetWidth = i;
        this.targetHeight = i2;
        this.targetFps = i3;
    }
}
