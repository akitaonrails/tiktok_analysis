package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderVideoConfig {
    public boolean enableBFrame;
    public int maxBitrateKBPS;
    public int minBitrateKBPS;
    public float roiH;
    public float roiW;
    public float roiX;
    public float roiY;
    public int upgradeHeight;
    public int upgradeWidth;
    public int width = 360;
    public int height = 640;
    public int fps = 15;
    public int gop = 2;
    public int bitrateKBPS = 500;
    public LyraxTranscoderVideoCodecType videoCodecType = LyraxTranscoderVideoCodecType.H264;

    public int getBitrateKBPS() {
        return this.bitrateKBPS;
    }

    public boolean getEnableBFrame() {
        return this.enableBFrame;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGop() {
        return this.gop;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxBitrateKBPS() {
        return this.maxBitrateKBPS;
    }

    public int getMinBitrateKBPS() {
        return this.minBitrateKBPS;
    }

    public float getRoiH() {
        return this.roiH;
    }

    public float getRoiW() {
        return this.roiW;
    }

    public float getRoiX() {
        return this.roiX;
    }

    public float getRoiY() {
        return this.roiY;
    }

    public int getUpgradeHeight() {
        return this.upgradeHeight;
    }

    public int getUpgradeWidth() {
        return this.upgradeWidth;
    }

    public LyraxTranscoderVideoCodecType getVideoCodecType() {
        return this.videoCodecType;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitrateKBPS(int i) {
        this.bitrateKBPS = i;
    }

    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setGop(int i) {
        this.gop = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxBitrateKBPS(int i) {
        this.maxBitrateKBPS = i;
    }

    public void setMinBitrateKBPS(int i) {
        this.minBitrateKBPS = i;
    }

    public void setVideoCodecType(LyraxTranscoderVideoCodecType lyraxTranscoderVideoCodecType) {
        this.videoCodecType = lyraxTranscoderVideoCodecType;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public void setUpgradeRes(int i, int i2) {
        this.upgradeWidth = i;
        this.upgradeHeight = i2;
    }

    public void setRoiInfo(float f, float f2, float f3, float f4) {
        this.roiX = f;
        this.roiY = f2;
        this.roiW = f3;
        this.roiH = f4;
    }
}
