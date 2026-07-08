package com.ss.android.ugc.aweme.player.sdk.psmv3;

/* JADX INFO: loaded from: classes24.dex */
public final class DynamicConfig {
    public final boolean concurrentReleaseFix;
    public final boolean disable264Recycle;
    public final boolean disable266Recycle;
    public final boolean disableAudioRecycle;
    public final boolean disableSRRecycle;
    public final boolean disableSoftwareDecodeRecycle;
    public final boolean optSessionAutoReset;
    public final int recyclerType;
    public final boolean sourceEqualAccuracy;
    public final int threadPoolInitStrategy;

    public DynamicConfig() {
        this(0, false, false, false, false, false, false, false, 0, false);
    }

    public final boolean getConcurrentReleaseFix() {
        return this.concurrentReleaseFix;
    }

    public final boolean getDisable264Recycle() {
        return this.disable264Recycle;
    }

    public final boolean getDisable266Recycle() {
        return this.disable266Recycle;
    }

    public final boolean getDisableAudioRecycle() {
        return this.disableAudioRecycle;
    }

    public final boolean getDisableSRRecycle() {
        return this.disableSRRecycle;
    }

    public final boolean getDisableSoftwareDecodeRecycle() {
        return this.disableSoftwareDecodeRecycle;
    }

    public final boolean getOptSessionAutoReset() {
        return this.optSessionAutoReset;
    }

    public final int getRecyclerType() {
        return this.recyclerType;
    }

    public final boolean getSourceEqualAccuracy() {
        return this.sourceEqualAccuracy;
    }

    public final int getThreadPoolInitStrategy() {
        return this.threadPoolInitStrategy;
    }

    public DynamicConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, boolean z8) {
        this.recyclerType = i;
        this.disableAudioRecycle = z;
        this.disable264Recycle = z2;
        this.disable266Recycle = z3;
        this.disableSoftwareDecodeRecycle = z4;
        this.disableSRRecycle = z5;
        this.sourceEqualAccuracy = z6;
        this.optSessionAutoReset = z7;
        this.threadPoolInitStrategy = i2;
        this.concurrentReleaseFix = z8;
    }
}
