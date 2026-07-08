package com.bytedance.ies.cutsame.cut_android;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoSlot {

    @C09CT("clip_end")
    public final double clipEnd;

    @C09CT("clip_start")
    public final double clipStart;

    @C09CT("endtime")
    public final double endTime;

    @C09CT("source")
    public final String source;

    @C09CT("starttime")
    public final double startTime;

    @C09CT("type")
    public final String type;

    @C09CT("uuid")
    public final String uuid;

    @C09CT("volume")
    public float volume;

    public VideoSlot() {
        this(0.0d, 0.0d, 0.0d, "", 0.0d, "", "", 0.0f);
    }

    public VideoSlot(double d, double d2, double d3, String str, double d4, String str2, String str3, float f) {
        this.clipEnd = d;
        this.clipStart = d2;
        this.endTime = d3;
        this.source = str;
        this.startTime = d4;
        this.type = str2;
        this.uuid = str3;
        this.volume = f;
    }
}
