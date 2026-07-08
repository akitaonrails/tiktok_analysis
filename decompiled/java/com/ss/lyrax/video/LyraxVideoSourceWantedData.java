package com.ss.lyrax.video;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSourceWantedData {
    public int frameRate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxVideoSourceWantedData(witdh='");
        sbLIZ.append(this.width);
        sbLIZ.append("' height=");
        sbLIZ.append(this.height);
        sbLIZ.append("' frameRate='");
        sbLIZ.append(this.frameRate);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxVideoSourceWantedData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }
}
