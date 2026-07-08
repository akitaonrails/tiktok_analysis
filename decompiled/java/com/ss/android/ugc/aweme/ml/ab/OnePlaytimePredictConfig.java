package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class OnePlaytimePredictConfig {

    @C09CT("real")
    public OnePlaytimePredictRealConfig realConfig;

    @C09CT("run_delay")
    public int runDelay;

    @C09CT("run_feed_gap")
    public int runFeedGap;

    @C09CT("run_time_gap")
    public int runTimeGap;

    @C09CT("config")
    public SmartSceneConfig sceneConfig;

    @C09CT("skip_count")
    public int skipCount;

    @C09CT("trigger")
    public int trigger;

    public String toString() {
        return super.toString();
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final int getRunDelay() {
        return this.runDelay;
    }

    public final int getRunFeedGap() {
        return this.runFeedGap;
    }

    public final int getRunTimeGap() {
        return this.runTimeGap;
    }

    public final SmartSceneConfig getSceneConfig() {
        return this.sceneConfig;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final int getTrigger() {
        return this.trigger;
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setRunDelay(int i) {
        this.runDelay = i;
    }

    public final void setRunFeedGap(int i) {
        this.runFeedGap = i;
    }

    public final void setRunTimeGap(int i) {
        this.runTimeGap = i;
    }

    public final void setSceneConfig(SmartSceneConfig smartSceneConfig) {
        this.sceneConfig = smartSceneConfig;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setTrigger(int i) {
        this.trigger = i;
    }
}
