package com.ss.lyrax.net;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNetProberOption {
    public int bottomLine1080pKbps;
    public int bottomLine540pKbps;
    public int bottomLine720pKbps;
    public String clientNetwork;
    public float firstOrderFilterParam;
    public int netInfoLogIntervalMs;
    public int peakAvgCount;
    public int proberAimLevel;
    public LyraxNetProberBandwidthCalcType proberBandwidthCalcType;
    public int proberBottomLevel;
    public int proberDurationMs;
    public int proberTargetBwKbps;
    public int proberValidTimeMs;
    public String rtmp_url;

    public LyraxNetProberOption() {
        this.proberDurationMs = 3900;
        this.proberValidTimeMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.netInfoLogIntervalMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.bottomLine540pKbps = 500;
        this.bottomLine720pKbps = 5600;
        this.bottomLine1080pKbps = 10000;
        this.proberBottomLevel = 2;
        this.proberAimLevel = 4;
        this.proberTargetBwKbps = 20000;
        this.proberBandwidthCalcType = LyraxNetProberBandwidthCalcType.NEWEST;
        this.firstOrderFilterParam = 0.9f;
        this.peakAvgCount = 1;
        this.clientNetwork = "";
        this.rtmp_url = "";
    }

    public int getBottomLine1080pKbps() {
        return this.bottomLine1080pKbps;
    }

    public int getBottomLine540pKbps() {
        return this.bottomLine540pKbps;
    }

    public int getBottomLine720pKbps() {
        return this.bottomLine720pKbps;
    }

    public String getClientNetwork() {
        return this.clientNetwork;
    }

    public float getFirstOrderFilterParam() {
        return this.firstOrderFilterParam;
    }

    public int getNetInfoLogIntervalMs() {
        return this.netInfoLogIntervalMs;
    }

    public int getPeakAvgCount() {
        return this.peakAvgCount;
    }

    public int getProberAimLevel() {
        return this.proberAimLevel;
    }

    public LyraxNetProberBandwidthCalcType getProberBandwidthCalcType() {
        return this.proberBandwidthCalcType;
    }

    public int getProberBottomLevel() {
        return this.proberBottomLevel;
    }

    public int getProberDurationMs() {
        return this.proberDurationMs;
    }

    public int getProberTargetBwKbps() {
        return this.proberTargetBwKbps;
    }

    public int getProberValidTimeMs() {
        return this.proberValidTimeMs;
    }

    public String getRtmpUrl() {
        return this.rtmp_url;
    }

    public LyraxNetProberOption(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, LyraxNetProberBandwidthCalcType lyraxNetProberBandwidthCalcType, float f, int i10, String str, String str2) {
        this.proberDurationMs = 3900;
        this.proberValidTimeMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.netInfoLogIntervalMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.bottomLine540pKbps = 500;
        this.bottomLine720pKbps = 5600;
        this.bottomLine1080pKbps = 10000;
        this.proberBottomLevel = 2;
        this.proberAimLevel = 4;
        this.proberTargetBwKbps = 20000;
        this.proberDurationMs = i;
        this.proberValidTimeMs = i2;
        this.netInfoLogIntervalMs = i3;
        this.bottomLine540pKbps = i4;
        this.bottomLine720pKbps = i5;
        this.bottomLine1080pKbps = i6;
        this.proberBottomLevel = i7;
        this.proberAimLevel = i8;
        this.proberTargetBwKbps = i9;
        this.proberBandwidthCalcType = lyraxNetProberBandwidthCalcType;
        this.firstOrderFilterParam = f;
        this.peakAvgCount = i10;
        this.clientNetwork = str;
        this.rtmp_url = str2;
    }
}
