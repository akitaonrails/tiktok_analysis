package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRtcVideoEncoderConfig {
    public final int bitrate;
    public final int fps;
    public final int height;
    public final String name;
    public final int width;

    public int getBitrate() {
        return this.bitrate;
    }

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxRtcVideoEncoderConfig(int i, int i2, int i3, int i4, String str) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bitrate = i4;
        this.name = str;
    }

    public static LyraxRtcVideoEncoderConfig create(int i, int i2, int i3, int i4, String str) {
        return new LyraxRtcVideoEncoderConfig(i, i2, i3, i4, str);
    }
}
