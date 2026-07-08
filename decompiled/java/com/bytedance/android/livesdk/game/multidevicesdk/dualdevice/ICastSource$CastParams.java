package com.bytedance.android.livesdk.game.multidevicesdk.dualdevice;

/* JADX INFO: loaded from: classes13.dex */
public final class ICastSource$CastParams {
    public Float bitRateScale;
    public Integer fps;
    public String ip;
    public int port;
    public int version;
    public int videoHeight;
    public int videoWidth;

    public final void setBitRateScale(Float f) {
        this.bitRateScale = f;
    }

    public final void setFps(Integer num) {
        this.fps = num;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setPort(int i) {
        this.port = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public ICastSource$CastParams(int i, String str, int i2, int i3, int i4, Integer num, Float f) {
        this.port = i;
        this.ip = str;
        this.videoWidth = i2;
        this.videoHeight = i3;
        this.version = i4;
        this.fps = num;
        this.bitRateScale = f;
    }
}
