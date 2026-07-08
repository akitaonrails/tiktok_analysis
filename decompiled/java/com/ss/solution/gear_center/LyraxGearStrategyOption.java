package com.ss.solution.gear_center;

import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearStrategyOption {
    public final Map<String, Object> customFeatures;
    public final boolean enableRunningResult;
    public final LyraxGearPerfData perfData;
    public final LyraxGearStrategyScene strategyScene;

    public LyraxGearStrategyOption() {
        this(LyraxGearStrategyScene.Recommend, false, null, null);
    }

    public final Map<String, Object> getCustomFeatures() {
        return this.customFeatures;
    }

    public final boolean getEnableRunningResult() {
        return this.enableRunningResult;
    }

    public final LyraxGearPerfData getPerfData() {
        return this.perfData;
    }

    public final LyraxGearStrategyScene getStrategyScene() {
        return this.strategyScene;
    }

    public LyraxGearStrategyOption(LyraxGearStrategyScene lyraxGearStrategyScene, boolean z, Map<String, ? extends Object> map, LyraxGearPerfData lyraxGearPerfData) {
        this.strategyScene = lyraxGearStrategyScene;
        this.enableRunningResult = z;
        this.customFeatures = map;
        this.perfData = lyraxGearPerfData;
    }
}
