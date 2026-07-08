package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RTCVideoParam {

    @C09CT("bitrate_kbps")
    public int bitRate;

    @C09CT("fps")
    public int fps;

    @C09CT("height")
    public int height;

    @C09CT("width")
    public int width;

    public RTCVideoParam() {
        this(0, 0, 0, 0);
    }

    public RTCVideoParam(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bitRate = i4;
    }
}
