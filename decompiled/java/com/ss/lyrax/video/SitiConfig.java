package com.ss.lyrax.video;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public class SitiConfig {

    @C09CT("drop_encode_fps")
    public boolean dropEncodeFps;

    @C09CT("extract_duration")
    public int extractDuration;

    @C09CT("frames_counts_calc_siti")
    public int framesCountsCalcSiti;

    @C09CT("interact_disable_siti")
    public boolean interactDisableSiti;

    @C09CT("period_ms")
    public int periodMs;

    @C09CT("thread_count")
    public int threadCount;

    @C09CT("using_arm")
    public boolean usingArm;

    @C09CT("using_gpu")
    public boolean usingGpu;

    public SitiConfig() {
        this.usingArm = true;
        this.extractDuration = 1;
    }

    public boolean getDropEncodeFps() {
        return this.dropEncodeFps;
    }

    public int getExtractDuration() {
        return this.extractDuration;
    }

    public int getFramesCountsCalcSiti() {
        return this.framesCountsCalcSiti;
    }

    public boolean getInteractDisableSiti() {
        return this.interactDisableSiti;
    }

    public int getPeriodMs() {
        return this.periodMs;
    }

    public int getThreadCount() {
        return this.threadCount;
    }

    public boolean getUsingArm() {
        return this.usingArm;
    }

    public boolean getUsingGpu() {
        return this.usingGpu;
    }

    public SitiConfig(boolean z, boolean z2, int i, int i2, int i3, int i4, boolean z3, boolean z4) {
        this.usingGpu = z;
        this.usingArm = z2;
        this.threadCount = i;
        this.periodMs = i2;
        this.framesCountsCalcSiti = i3;
        this.extractDuration = i4;
        this.interactDisableSiti = z3;
        this.dropEncodeFps = z4;
    }
}
