package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoBitrateGearTableItem {
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getMinBitrate() {
        return this.minBitrate;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxVideoBitrateGearTableItem(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
    }

    public static LyraxVideoBitrateGearTableItem create(int i, int i2, int i3, int i4, int i5) {
        return new LyraxVideoBitrateGearTableItem(i, i2, i3, i4, i5);
    }
}
