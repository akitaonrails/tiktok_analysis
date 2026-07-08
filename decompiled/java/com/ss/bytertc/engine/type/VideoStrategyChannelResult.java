package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes21.dex */
public class VideoStrategyChannelResult {
    public int channelIndex = -1;
    public int perfWidth = -1;
    public int perfHeight = -1;
    public int perfFps = -1;
    public int netWidth = -1;
    public int netHeight = -1;
    public int netFps = -1;
    public int finalWidth = -1;
    public int finalHeight = -1;
    public int finalFps = -1;
    public int finalBps = -1;
    public int maxBps = -1;
    public int minBps = -1;
    public int minRequestBps = -1;

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public int getFinalBps() {
        return this.finalBps;
    }

    public int getFinalFps() {
        return this.finalFps;
    }

    public int getFinalHeight() {
        return this.finalHeight;
    }

    public int getFinalWidth() {
        return this.finalWidth;
    }

    public int getMaxBps() {
        return this.maxBps;
    }

    public int getMinBps() {
        return this.minBps;
    }

    public int getMinRequestBps() {
        return this.minRequestBps;
    }

    public int getNetFps() {
        return this.netFps;
    }

    public int getNetHeight() {
        return this.netHeight;
    }

    public int getNetWidth() {
        return this.netWidth;
    }

    public int getPerfFps() {
        return this.perfFps;
    }

    public int getPerfHeight() {
        return this.perfHeight;
    }

    public int getPerfWidth() {
        return this.perfWidth;
    }
}
