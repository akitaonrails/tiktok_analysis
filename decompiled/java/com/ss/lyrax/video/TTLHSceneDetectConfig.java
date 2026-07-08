package com.ss.lyrax.video;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHSceneDetectConfig {

    @C09CT("delay_start_ms")
    public int delayStartMs;

    @C09CT("detect_shorter_edge_length")
    public int detectShorterEdgeLength;

    @C09CT("enable_linkmic_detect")
    public boolean enableLinkmicDetect;

    @C09CT("enable_scene_detect")
    public boolean enableSceneDetect;

    @C09CT("min_detect_interval_ms")
    public int minDetectIntervalMs;

    @C09CT("detect_interval_ms")
    public int sceneDetectIntervalMs;

    public TTLHSceneDetectConfig() {
        this.sceneDetectIntervalMs = LSPassThroughRecordSizeConfig.DEFAULT;
        this.minDetectIntervalMs = LSPassThroughRecordSizeConfig.DEFAULT;
        this.delayStartMs = LSPassThroughRecordSizeConfig.DEFAULT;
        this.detectShorterEdgeLength = 360;
    }

    public TTLHSceneDetectConfig(boolean z, int i, int i2, int i3) {
        this.detectShorterEdgeLength = 360;
        this.enableSceneDetect = z;
        this.sceneDetectIntervalMs = i;
        this.minDetectIntervalMs = i2;
        this.delayStartMs = i3;
    }
}
