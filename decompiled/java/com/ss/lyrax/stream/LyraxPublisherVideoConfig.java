package com.ss.lyrax.stream;

import com.ss.lyrax.transcoder.LyraxTranscoderVideoCodecType;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherVideoConfig {
    public boolean enableBFrame;
    public int fps;
    public int gopSize;
    public int height;
    public boolean isHardware;
    public int maxBitrateKbps;
    public int minBitrateKbps;
    public int simChannelNumber;
    public int startBitrateKbps;
    public LyraxTranscoderVideoCodecType videoCodecType;
    public int width;

    public int getVideoCodecType() {
        return this.videoCodecType.value();
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

    public LyraxPublisherVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2, LyraxTranscoderVideoCodecType lyraxTranscoderVideoCodecType, int i8) {
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.startBitrateKbps = i4;
        this.minBitrateKbps = i5;
        this.maxBitrateKbps = i6;
        this.enableBFrame = z;
        this.gopSize = i7;
        this.isHardware = z2;
        this.videoCodecType = lyraxTranscoderVideoCodecType;
        this.simChannelNumber = i8;
    }
}
