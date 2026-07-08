package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRtcVideoPerformanceConfig {
    public final int fps;
    public final int height;
    public final int width;

    public int getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxRtcVideoPerformanceConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
    }

    public static LyraxRtcVideoPerformanceConfig create(int i, int i2, int i3) {
        return new LyraxRtcVideoPerformanceConfig(i, i2, i3);
    }
}
