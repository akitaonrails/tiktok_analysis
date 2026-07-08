package com.ss.bytertc.engine.livepusher;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLivePusherConfig {
    public String anchorIDCName;
    public InternalLivePusherAudioConfig audioConfig;
    public boolean enableLiveAB;
    public boolean isAutoSubscribeAudio;
    public boolean isAutoSubscribeVideo;
    public MixedStreamType mixType;
    public int reconnectDuration;
    public int reportTimerInterval;
    public InternalLivePusherVideoConfig videoConfig;

    public int getMixType() {
        return this.mixType.value();
    }

    public boolean enableLiveAB() {
        return this.enableLiveAB;
    }

    public String getAnchorIDCName() {
        return this.anchorIDCName;
    }

    public InternalLivePusherAudioConfig getAudioConfig() {
        return this.audioConfig;
    }

    public int getReconnectDuration() {
        return this.reconnectDuration;
    }

    public int getReportTimerInterval() {
        return this.reportTimerInterval;
    }

    public InternalLivePusherVideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public boolean isAutoSubscribeAudio() {
        return this.isAutoSubscribeAudio;
    }

    public boolean isAutoSubscribeVideo() {
        return this.isAutoSubscribeVideo;
    }

    public InternalLivePusherConfig(LivePusherConfig livePusherConfig) {
        this.reconnectDuration = 30;
        this.reportTimerInterval = 10000;
        this.anchorIDCName = "";
        this.reconnectDuration = livePusherConfig.reconnectDuration;
        this.reportTimerInterval = livePusherConfig.reportTimerInterval;
        this.videoConfig = new InternalLivePusherVideoConfig(livePusherConfig.videoConfig);
        this.audioConfig = new InternalLivePusherAudioConfig(livePusherConfig.audioConfig);
        this.mixType = livePusherConfig.mixType;
        this.isAutoSubscribeAudio = livePusherConfig.isAutoSubscribeAudio;
        this.isAutoSubscribeVideo = livePusherConfig.isAutoSubscribeVideo;
        this.enableLiveAB = livePusherConfig.enableLiveAB;
        this.anchorIDCName = livePusherConfig.anchorIDCName;
    }
}
