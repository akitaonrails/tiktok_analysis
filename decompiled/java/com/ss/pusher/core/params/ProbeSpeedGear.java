package com.ss.pusher.core.params;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class ProbeSpeedGear {

    @C09CT("defaultBitrate")
    public final int defaultBitrate;

    @C09CT("fps")
    public final int fps;

    @C09CT("height")
    public final int height;

    @C09CT("maxBitrate")
    public final int maxBitrate;

    @C09CT("minBitrate")
    public final int minBitrate;

    @C09CT("width")
    public final int width;

    public ProbeSpeedGear() {
        this(0, 0, 0, 0, 0, 0);
    }

    public final boolean LIZ() {
        return this.height > 0 && this.width > 0 && this.fps > 0 && this.maxBitrate > 0 && this.minBitrate > 0;
    }

    public ProbeSpeedGear(int i, int i2, int i3, int i4, int i5, int i6) {
        this.height = i;
        this.width = i2;
        this.fps = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        this.defaultBitrate = i6;
    }
}
