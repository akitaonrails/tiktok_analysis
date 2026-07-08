package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxMediaEnhanceConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public LyraxMediaEnhanceConfig() {
    }

    public boolean getEnhanceAudio() {
        return this.enhanceAudio;
    }

    public boolean getEnhanceScreenAudio() {
        return this.enhanceScreenAudio;
    }

    public boolean getEnhanceScreenVideo() {
        return this.enhanceScreenVideo;
    }

    public boolean getEnhanceSignaling() {
        return this.enhanceSignaling;
    }

    public boolean getEnhanceVideo() {
        return this.enhanceVideo;
    }

    public LyraxMediaEnhanceConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enhanceSignaling = z;
        this.enhanceAudio = z2;
        this.enhanceVideo = z3;
        this.enhanceScreenAudio = z4;
        this.enhanceScreenVideo = z5;
    }
}
