package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameInfo {
    public int height;
    public VideoRotation rotation;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFrameInfo{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VideoFrameInfo(int i, int i2, int i3) {
        this.rotation = VideoRotation.VIDEO_ROTATION_0;
        this.width = i;
        this.height = i2;
        this.rotation = VideoRotation.fromId(i3);
    }
}
