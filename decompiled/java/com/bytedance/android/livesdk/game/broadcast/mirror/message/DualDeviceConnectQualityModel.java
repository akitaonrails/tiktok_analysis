package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class DualDeviceConnectQualityModel {

    @C09CT("bitrate")
    public final float bitrate;

    @C09CT("cmd")
    public final String cmd;

    @C09CT("networkLatency")
    public final float networkLatency;

    @C09CT("streamFps")
    public final float streamFps;

    public DualDeviceConnectQualityModel(String str, float f, float f2, float f3) {
        this.cmd = str;
        this.networkLatency = f;
        this.streamFps = f2;
        this.bitrate = f3;
    }
}
