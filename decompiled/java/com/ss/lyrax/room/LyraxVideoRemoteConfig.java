package com.ss.lyrax.room;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class LyraxVideoRemoteConfig {
    public int framerate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxVideoRemoteConfig{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", framerate=");
        sbLIZ.append(this.framerate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getFrameRate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxVideoRemoteConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.framerate = i3;
    }
}
