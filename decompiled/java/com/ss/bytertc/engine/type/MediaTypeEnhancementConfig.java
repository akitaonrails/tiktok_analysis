package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes21.dex */
public class MediaTypeEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public MediaTypeEnhancementConfig() {
    }

    public MediaTypeEnhancementConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enhanceSignaling = z;
        this.enhanceAudio = z2;
        this.enhanceVideo = z3;
        this.enhanceScreenAudio = z4;
        this.enhanceScreenVideo = z5;
    }
}
