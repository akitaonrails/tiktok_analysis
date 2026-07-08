package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHBlackDetectConfigParser {

    @C09CT("detect_interval_ms")
    public int blackDetectIntervalMs;

    @C09CT("target_pixels")
    public int blackDetectTargetPixels;

    @C09CT("black_detect_threshold")
    public float blackDetectThreshold;

    @C09CT("black_detect_y_threshold")
    public int blackDetectYthreshold;

    @C09CT("enable")
    public boolean enable;

    public TTLHBlackDetectConfigParser() {
        this.blackDetectThreshold = 0.95f;
        this.blackDetectYthreshold = 8;
        this.blackDetectIntervalMs = 2000;
        this.blackDetectTargetPixels = 14400;
    }

    public TTLHBlackDetectConfigParser(boolean z, float f, int i, int i2, int i3) {
        this.enable = z;
        this.blackDetectThreshold = f;
        this.blackDetectYthreshold = i;
        this.blackDetectIntervalMs = i2;
        this.blackDetectTargetPixels = i3;
    }
}
