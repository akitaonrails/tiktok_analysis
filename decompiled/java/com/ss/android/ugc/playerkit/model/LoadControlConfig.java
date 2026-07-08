package com.ss.android.ugc.playerkit.model;

import X.C1473360oRa;

/* JADX INFO: loaded from: classes24.dex */
public class LoadControlConfig {
    public double bandwidthFactor;
    public double bitrateFactorBase;
    public double bitrateFactorCoff;
    public int blockExprType;
    public int earlyStallTime;
    public boolean enable;
    public boolean enableAdjustAfterSeek;
    public boolean enableAdjustWhenNotRebuffering;
    public boolean enableMinBufferThreshold;
    public int minBufferThreshold;
    public C1473360oRa nonPreloadParam;
    public C1473360oRa preloadParam;
    public C1473360oRa rmbParam;
    public double sealBalance;
    public int sealCostTimeMax;
    public int sealMax;
    public int sealMin;
    public long slidingWindow;
    public int startExprType;
    public int validCacheSize;
    public double videoDurationParam;
    public double videoDurationParamA;
    public double videoDurationParamB;
    public double videoDurationParamC;
    public double videoDurationParamD;
    public int strategy = 1;
    public boolean enableLatestSpeedParam = true;
    public int latestSpeedFilterCnt = 3;
    public double speedThreshold = 1.0d;
    public int minBufferThresholdAfterSeek = 200;

    public boolean enableStrategyOld() {
        return this.enable && this.strategy == 1;
    }

    public boolean enableStrategySeal() {
        return this.enable && this.strategy == 2;
    }

    public LoadControlConfig(boolean z) {
        this.enable = z;
    }
}
