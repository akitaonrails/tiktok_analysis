package com.ss.lyrax.ttlh_adapter.push_param;

import com.ss.lyrax.video.LinkMicVideoConfig;
import com.ss.lyrax.video.VideoBufferPoolConfig;

/* JADX INFO: loaded from: classes21.dex */
public class SDKSettingsVideoConfig {
    public boolean compareCameraRealFps;
    public int darkSyncMinEnable;
    public boolean enableRoundedCorner;
    public boolean incrementalParsing;
    public int lightCheckStrategy;
    public int linkmicNormalLiveMinFps;
    public LinkMicVideoConfig linkmicVideoConfig;
    public int pauseFps;
    public boolean renderReportOpt;
    public VideoBufferPoolConfig videoBufferPoolConfig;

    public SDKSettingsVideoConfig() {
        this.linkmicNormalLiveMinFps = 15;
        this.videoBufferPoolConfig = new VideoBufferPoolConfig();
        this.linkmicVideoConfig = new LinkMicVideoConfig();
        this.compareCameraRealFps = false;
        this.pauseFps = 1;
        this.incrementalParsing = false;
    }

    public boolean getCompareCameraRealFps() {
        return this.compareCameraRealFps;
    }

    public int getDarkSyncMinEnable() {
        return this.darkSyncMinEnable;
    }

    public boolean getEnableRoundedCorner() {
        return this.enableRoundedCorner;
    }

    public int getLightCheckStrategy() {
        return this.lightCheckStrategy;
    }

    public LinkMicVideoConfig getLinkMicVideoConfig() {
        return this.linkmicVideoConfig;
    }

    public int getLinkmicNormalLiveMinFps() {
        return this.linkmicNormalLiveMinFps;
    }

    public int getPauseFps() {
        return this.pauseFps;
    }

    public boolean getRenderReportOpt() {
        return this.renderReportOpt;
    }

    public VideoBufferPoolConfig getVideoBufferPoolConfig() {
        return this.videoBufferPoolConfig;
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public SDKSettingsVideoConfig(int i, int i2, int i3, boolean z, boolean z2, VideoBufferPoolConfig videoBufferPoolConfig, int i4, LinkMicVideoConfig linkMicVideoConfig, boolean z3) {
        this.linkmicNormalLiveMinFps = 15;
        this.videoBufferPoolConfig = new VideoBufferPoolConfig();
        new LinkMicVideoConfig();
        this.incrementalParsing = false;
        this.lightCheckStrategy = i;
        this.darkSyncMinEnable = i2;
        this.linkmicNormalLiveMinFps = i3;
        this.enableRoundedCorner = z;
        this.renderReportOpt = z2;
        this.videoBufferPoolConfig = videoBufferPoolConfig;
        this.pauseFps = i4;
        this.linkmicVideoConfig = linkMicVideoConfig;
        this.compareCameraRealFps = z3;
    }
}
