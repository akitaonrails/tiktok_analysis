package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoPerfDegradeLimit {
    public int maxFps;
    public int maxHeight;
    public int maxWidth;

    public int getMaxFps() {
        return this.maxFps;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public LyraxVideoPerfDegradeLimit(int i, int i2, int i3) {
        this.maxWidth = i;
        this.maxHeight = i2;
        this.maxFps = i3;
    }
}
