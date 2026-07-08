package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHGreenDetectConfigParser {

    @C09CT("enable")
    public boolean enable;

    @C09CT("detect_interval_ms")
    public int greenDetectIntervalMs;

    @C09CT("target_pixels")
    public int greenDetectTargetPixels;

    @C09CT("green_detect_threshold")
    public float greenDetectThreshold;

    @C09CT("green_detect_uv_threshold")
    public int greenDetectUVthreshold;

    public TTLHGreenDetectConfigParser() {
        this.greenDetectThreshold = 0.95f;
        this.greenDetectUVthreshold = 8;
        this.greenDetectIntervalMs = 2000;
        this.greenDetectTargetPixels = 14400;
    }

    public TTLHGreenDetectConfigParser(boolean z, float f, int i, int i2, int i3) {
        this.enable = z;
        this.greenDetectThreshold = f;
        this.greenDetectUVthreshold = i;
        this.greenDetectIntervalMs = i2;
        this.greenDetectTargetPixels = i3;
    }
}
