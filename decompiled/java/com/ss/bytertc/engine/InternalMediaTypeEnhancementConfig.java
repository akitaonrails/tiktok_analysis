package com.ss.bytertc.engine;

import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;

/* JADX INFO: loaded from: classes21.dex */
public class InternalMediaTypeEnhancementConfig {
    public boolean enhanceAudio;
    public boolean enhanceScreenAudio;
    public boolean enhanceScreenVideo;
    public boolean enhanceSignaling;
    public boolean enhanceVideo;

    public boolean getAudioEnhance() {
        return this.enhanceAudio;
    }

    public boolean getScreenAudioEnhance() {
        return this.enhanceScreenAudio;
    }

    public boolean getScreenVideoEnhance() {
        return this.enhanceScreenVideo;
    }

    public boolean getSignalingEnhance() {
        return this.enhanceSignaling;
    }

    public boolean getVideoEnhance() {
        return this.enhanceVideo;
    }

    public InternalMediaTypeEnhancementConfig(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        this.enhanceSignaling = mediaTypeEnhancementConfig.enhanceSignaling;
        this.enhanceAudio = mediaTypeEnhancementConfig.enhanceAudio;
        this.enhanceVideo = mediaTypeEnhancementConfig.enhanceVideo;
        this.enhanceScreenAudio = mediaTypeEnhancementConfig.enhanceScreenAudio;
        this.enhanceScreenVideo = mediaTypeEnhancementConfig.enhanceScreenVideo;
    }
}
