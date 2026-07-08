package com.ss.solution.gear_center;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearStrategyResult {
    public final int captureLevel;
    public final int effectLevel;
    public final String gearIdentifier;
    public final int gearLevel;
    public final LyraxGearModel gearModel;
    public final boolean isProbeRunning;
    public final LyraxGearMetaData metaData;
    public final int probeBandwidth;
    public final LyraxGearStrategyResultSource resultSource;
    public final LyraxGearStrategyScene strategyScene;

    public LyraxGearStrategyResult() {
        this(-1, -1, -1, null, null, false, -1, LyraxGearStrategyScene.Recommend, LyraxGearStrategyResultSource.Default, "");
    }

    public final int getCaptureLevel() {
        return this.captureLevel;
    }

    public final int getEffectLevel() {
        return this.effectLevel;
    }

    public final String getGearIdentifier() {
        return this.gearIdentifier;
    }

    public final int getGearLevel() {
        return this.gearLevel;
    }

    public final LyraxGearModel getGearModel() {
        return this.gearModel;
    }

    public final LyraxGearMetaData getMetaData() {
        return this.metaData;
    }

    public final int getProbeBandwidth() {
        return this.probeBandwidth;
    }

    public final LyraxGearStrategyResultSource getResultSource() {
        return this.resultSource;
    }

    public final LyraxGearStrategyScene getStrategyScene() {
        return this.strategyScene;
    }

    public final boolean isProbeRunning() {
        return this.isProbeRunning;
    }

    public LyraxGearStrategyResult(int i, int i2, int i3, LyraxGearModel lyraxGearModel, LyraxGearMetaData lyraxGearMetaData, boolean z, int i4, LyraxGearStrategyScene lyraxGearStrategyScene, LyraxGearStrategyResultSource lyraxGearStrategyResultSource, String str) {
        this.gearLevel = i;
        this.effectLevel = i2;
        this.captureLevel = i3;
        this.gearModel = lyraxGearModel;
        this.metaData = lyraxGearMetaData;
        this.isProbeRunning = z;
        this.probeBandwidth = i4;
        this.strategyScene = lyraxGearStrategyScene;
        this.resultSource = lyraxGearStrategyResultSource;
        this.gearIdentifier = str;
    }
}
