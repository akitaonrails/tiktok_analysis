package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoVideoConfig {

    @C09CT("bitrate")
    public final int bitrate;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoVideoConfig)) {
            return false;
        }
        TakoVideoConfig takoVideoConfig = (TakoVideoConfig) obj;
        return this.width == takoVideoConfig.width && this.height == takoVideoConfig.height && this.fps == takoVideoConfig.fps && this.bitrate == takoVideoConfig.bitrate && this.maxBitrate == takoVideoConfig.maxBitrate && this.minBitrate == takoVideoConfig.minBitrate;
    }

    public final int hashCode() {
        return (((((((((this.width * 31) + this.height) * 31) + this.fps) * 31) + this.bitrate) * 31) + this.maxBitrate) * 31) + this.minBitrate;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoConfig(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.bitrate);
        sbLIZ.append(", maxBitrate=");
        sbLIZ.append(this.maxBitrate);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.minBitrate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoVideoConfig() {
        this(360, 640, 2, 240000, 300000, 150000);
    }

    public TakoVideoConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bitrate = i4;
        this.maxBitrate = i5;
        this.minBitrate = i6;
    }
}
