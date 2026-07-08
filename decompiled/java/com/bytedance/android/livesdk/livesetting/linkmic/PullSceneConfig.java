package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class PullSceneConfig {

    @C09CT("dimensions")
    public Map<String, PullSceneConfig> dimensions;

    @C09CT("enable")
    public int enable;

    @C09CT("intelligent")
    public int intelligent;

    @C09CT("level_num")
    public int levelNum;

    @C09CT("intelligent_key")
    public String probKey;

    @C09CT("pull_delay")
    public long pullDelay;

    @C09CT("pull_time")
    public long pullTime;

    @C09CT("intelligent_threshold")
    public Float threshold;

    @C09CT("traffic_control")
    public int trafficControl;

    public PullSceneConfig() {
        this(0, 0, 0, 0L, 0L, null, null, 0, null);
    }

    public final Map<String, PullSceneConfig> getDimensions() {
        return this.dimensions;
    }

    public final int getEnable() {
        return this.enable;
    }

    public final int getIntelligent() {
        return this.intelligent;
    }

    public final int getLevelNum() {
        return this.levelNum;
    }

    public final String getProbKey() {
        return this.probKey;
    }

    public final long getPullDelay() {
        return this.pullDelay;
    }

    public final long getPullTime() {
        return this.pullTime;
    }

    public final Float getThreshold() {
        return this.threshold;
    }

    public final int getTrafficControl() {
        return this.trafficControl;
    }

    public final void setDimensions(Map<String, PullSceneConfig> map) {
        this.dimensions = map;
    }

    public final void setEnable(int i) {
        this.enable = i;
    }

    public final void setIntelligent(int i) {
        this.intelligent = i;
    }

    public final void setLevelNum(int i) {
        this.levelNum = i;
    }

    public final void setProbKey(String str) {
        this.probKey = str;
    }

    public final void setPullDelay(long j) {
        this.pullDelay = j;
    }

    public final void setPullTime(long j) {
        this.pullTime = j;
    }

    public final void setThreshold(Float f) {
        this.threshold = f;
    }

    public final void setTrafficControl(int i) {
        this.trafficControl = i;
    }

    public PullSceneConfig(int i, int i2, int i3, long j, long j2, Float f, String str, int i4, Map<String, PullSceneConfig> map) {
        this.enable = i;
        this.levelNum = i2;
        this.intelligent = i3;
        this.pullTime = j;
        this.pullDelay = j2;
        this.threshold = f;
        this.probKey = str;
        this.trafficControl = i4;
        this.dimensions = map;
    }
}
