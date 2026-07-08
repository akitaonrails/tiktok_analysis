package com.ss.bytertc.engine.livepusher;

import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: loaded from: classes21.dex */
public class InternalLivePusherVideoConfig {
    public boolean enableBFrame;
    public int fps;
    public int gopSize;
    public int height;
    public boolean isHardware;
    public int maxBitrateKbps;
    public int minBitrateKbps;
    public int simChannelNumber;
    public int startBitrateKbps;
    public MixedStreamConfig.MixedStreamVideoConfig.MixedStreamVideoCodecType videoCodecType;
    public int width;

    public String getVideoCodecType() {
        return this.videoCodecType.getValue();
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxBitrateKbps() {
        return this.maxBitrateKbps;
    }

    public int getMinBitrateKbps() {
        return this.minBitrateKbps;
    }

    public int getSimChannelNumber() {
        return this.simChannelNumber;
    }

    public int getWidth() {
        return this.width;
    }

    public int getstartBitrateKbps() {
        return this.startBitrateKbps;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isHardware() {
        return this.isHardware;
    }

    public InternalLivePusherVideoConfig(LivePusherVideoConfig livePusherVideoConfig) {
        this.width = livePusherVideoConfig.width;
        this.height = livePusherVideoConfig.height;
        this.fps = livePusherVideoConfig.fps;
        this.startBitrateKbps = livePusherVideoConfig.startBitrateKbps;
        this.minBitrateKbps = livePusherVideoConfig.minBitrateKbps;
        this.maxBitrateKbps = livePusherVideoConfig.maxBitrateKbps;
        this.enableBFrame = livePusherVideoConfig.enableBFrame;
        this.gopSize = livePusherVideoConfig.gopSize;
        this.isHardware = livePusherVideoConfig.isHardware;
        this.videoCodecType = livePusherVideoConfig.videoCodecType;
        this.simChannelNumber = livePusherVideoConfig.simChannelNumber;
    }
}
