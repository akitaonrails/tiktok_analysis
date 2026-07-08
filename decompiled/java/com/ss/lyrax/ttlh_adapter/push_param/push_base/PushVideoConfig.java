package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import com.ss.lyrax.video.TTLHSceneDetectConfig;

/* JADX INFO: loaded from: classes21.dex */
public class PushVideoConfig {
    public int defaultBitrate;
    public boolean enableVideoAdaptiveForGameLinkmic;
    public PushVideoEncodeConfig encodeConfig;
    public PushVideoFilterConfig filterConfig;
    public int fps;
    public int height;
    public boolean incrementalParsing;
    public int maxBitrate;
    public int minBitrate;
    public PushVideoRenderConfig renderConfig;
    public TTLHSceneDetectConfig ttlhSceneDetectConfig;
    public String videoProfileStr;
    public int width;

    public int getDefaultBitrate() {
        if (this.defaultBitrate == -1) {
            this.defaultBitrate = 800000;
        }
        return this.defaultBitrate;
    }

    public int getFps() {
        if (this.fps == -1) {
            this.fps = 25;
        }
        return this.fps;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == -1) {
            this.maxBitrate = 0;
        }
        return this.maxBitrate;
    }

    public int getMinBitrate() {
        if (this.minBitrate == -1) {
            this.minBitrate = 0;
        }
        return this.minBitrate;
    }

    public PushVideoConfig() {
        this.filterConfig = new PushVideoFilterConfig();
        this.renderConfig = new PushVideoRenderConfig();
        this.encodeConfig = new PushVideoEncodeConfig();
        this.width = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;
        this.defaultBitrate = -1;
        this.minBitrate = -1;
        this.maxBitrate = -1;
        this.fps = -1;
        this.ttlhSceneDetectConfig = new TTLHSceneDetectConfig();
        this.enableVideoAdaptiveForGameLinkmic = false;
        this.incrementalParsing = false;
    }

    public boolean getEnableVideoAdaptiveForGameLinkmic() {
        return this.enableVideoAdaptiveForGameLinkmic;
    }

    public int getHeight() {
        return this.height;
    }

    public TTLHSceneDetectConfig getTtlhSceneDetectConfig() {
        return this.ttlhSceneDetectConfig;
    }

    public String getVideoProfileStr() {
        return this.videoProfileStr;
    }

    public int getWidth() {
        return this.width;
    }

    public void setDefaultBitrate(int i) {
        if (this.defaultBitrate == -1 || !this.incrementalParsing) {
            this.defaultBitrate = i;
        }
    }

    public void setFps(int i) {
        if (this.fps == -1 || !this.incrementalParsing) {
            this.fps = i;
        }
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
        PushVideoEncodeConfig pushVideoEncodeConfig = this.encodeConfig;
        if (pushVideoEncodeConfig != null) {
            pushVideoEncodeConfig.setIncrementalParsing(z);
        }
    }

    public void setMaxBitrate(int i) {
        if (this.maxBitrate == -1 || !this.incrementalParsing) {
            this.maxBitrate = i;
        }
    }

    public void setMinBitrate(int i) {
        if (this.minBitrate == -1 || !this.incrementalParsing) {
            this.minBitrate = i;
        }
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public PushVideoConfig(PushVideoFilterConfig pushVideoFilterConfig, PushVideoRenderConfig pushVideoRenderConfig, PushVideoEncodeConfig pushVideoEncodeConfig, int i, int i2, String str, int i3, int i4, int i5, int i6, TTLHSceneDetectConfig tTLHSceneDetectConfig, boolean z) {
        this.filterConfig = new PushVideoFilterConfig();
        this.renderConfig = new PushVideoRenderConfig();
        this.encodeConfig = new PushVideoEncodeConfig();
        this.width = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;
        this.defaultBitrate = -1;
        this.minBitrate = -1;
        this.maxBitrate = -1;
        this.fps = -1;
        new TTLHSceneDetectConfig();
        this.incrementalParsing = false;
        this.filterConfig = pushVideoFilterConfig;
        this.renderConfig = pushVideoRenderConfig;
        this.encodeConfig = pushVideoEncodeConfig;
        this.width = i;
        this.height = i2;
        this.videoProfileStr = str;
        this.defaultBitrate = i3;
        this.minBitrate = i4;
        this.maxBitrate = i5;
        this.fps = i6;
        this.ttlhSceneDetectConfig = tTLHSceneDetectConfig;
        this.enableVideoAdaptiveForGameLinkmic = z;
    }
}
