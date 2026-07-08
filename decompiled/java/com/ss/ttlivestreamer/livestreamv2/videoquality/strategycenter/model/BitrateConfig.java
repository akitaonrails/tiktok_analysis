package com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC2178851APb;

/* JADX INFO: loaded from: classes36.dex */
public class BitrateConfig {
    public EnumC2178851APb LIZ;
    public String LIZIZ;

    @C09CT("desc")
    public String desc;

    @C09CT("fps")
    public int fps;

    @C09CT("height")
    public int height;

    @C09CT("size")
    public String level;

    @C09CT("name")
    public String name;

    @C09CT("sdk_key")
    public String sdkKey;

    @C09CT("width")
    public int width;

    @C09CT("defaultBitrate")
    public long defaultBitrate = -1;

    @C09CT("maxBitrate")
    public long maxBitrate = -1;

    @C09CT("minBitrate")
    public long minBitrate = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitrateConfig{defaultBitrate=");
        sbLIZ.append(this.defaultBitrate);
        sbLIZ.append(", maxBitrate=");
        sbLIZ.append(this.maxBitrate);
        sbLIZ.append(", minBitrate=");
        sbLIZ.append(this.minBitrate);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", level='");
        sbLIZ.append(this.level);
        sbLIZ.append('\'');
        sbLIZ.append(", fps=");
        sbLIZ.append(this.fps);
        sbLIZ.append(", sdkKey='");
        sbLIZ.append(this.sdkKey);
        sbLIZ.append('\'');
        sbLIZ.append(", desc='");
        sbLIZ.append(this.desc);
        sbLIZ.append('\'');
        sbLIZ.append(", name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", gameLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
