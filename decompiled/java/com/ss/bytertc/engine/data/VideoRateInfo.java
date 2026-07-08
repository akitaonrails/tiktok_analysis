package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class VideoRateInfo {
    public int bitrateKbps;
    public int fps;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoRateInfo{fps='");
        sbLIZ.append(this.fps);
        sbLIZ.append('\'');
        sbLIZ.append(", bitrateKbps='");
        sbLIZ.append(this.bitrateKbps);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoRateInfo(int i, int i2) {
        this.fps = i;
        this.bitrateKbps = i2;
    }
}
