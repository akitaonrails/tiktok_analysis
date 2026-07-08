package com.ss.ttlivestreamer.livestreamv2;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class NetDegradeTableItem {

    @C09CT("bitrate")
    public final int bitrate;

    @C09CT("down_threshold_kbps")
    public final int down_threshold_kbps;

    @C09CT("fps")
    public final int fps;

    @C09CT("height")
    public final int height;

    @C09CT("up_threshold_kbps")
    public final int up_threshold_kbps;

    @C09CT("width")
    public final int width;

    public NetDegradeTableItem(int i, int i2, int i3, int i4, int i5, int i6) {
        this.height = i;
        this.width = i2;
        this.bitrate = i3;
        this.fps = i4;
        this.up_threshold_kbps = i5;
        this.down_threshold_kbps = i6;
    }
}
