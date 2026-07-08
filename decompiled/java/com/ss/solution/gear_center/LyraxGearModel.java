package com.ss.solution.gear_center;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearModel {
    public final int defaultBitrate;
    public final String desc;
    public final int fps;
    public final int height;
    public final int level;
    public final int maxBitrate;
    public final int minBitrate;
    public final String name;
    public final String title;
    public final int width;

    public LyraxGearModel() {
        this(-1, "", "", "", -1, -1, -1, -1, -1, -1);
    }

    public final int getDefaultBitrate() {
        return this.defaultBitrate;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    public final int getMinBitrate() {
        return this.minBitrate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getWidth() {
        return this.width;
    }

    public LyraxGearModel(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.level = i;
        this.name = str;
        this.title = str2;
        this.desc = str3;
        this.width = i2;
        this.height = i3;
        this.fps = i4;
        this.minBitrate = i5;
        this.maxBitrate = i6;
        this.defaultBitrate = i7;
    }
}
