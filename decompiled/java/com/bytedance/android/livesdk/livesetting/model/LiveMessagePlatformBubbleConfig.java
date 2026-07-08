package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessagePlatformBubbleConfig implements Serializable {

    @C09CT("filter_reason")
    public final String filterReason;

    @C09CT("lifetime")
    public final int lifetime;

    @C09CT("orientation")
    public long orientation;

    @C09CT("position")
    public final String position;

    @C09CT("priority")
    public final int priority;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("show_count")
    public final int showCount;

    @C09CT("show_duration")
    public final long showDuration;

    @C09CT("skip_continuous_watch_fc")
    public boolean skipContinuousWatchFc;

    @C09CT("skip_watch_early_fc")
    public boolean skipWatchEarlyFc;

    @C09CT("strategy_decision_key")
    public final String strategyDecisionKey;

    @C09CT("strategy_scene")
    public final String strategyScene;

    @C09CT("user_type")
    public long userType;

    public LiveMessagePlatformBubbleConfig() {
        this(0, 0, "", null, -1, Mp4ScreenVideoLoadTimeout.CONTROL, 0, null, null, 0L, 0L, false, false);
    }

    public final void setOrientation(long j) {
        this.orientation = j;
    }

    public final void setSkipContinuousWatchFc(boolean z) {
        this.skipContinuousWatchFc = z;
    }

    public final void setSkipWatchEarlyFc(boolean z) {
        this.skipWatchEarlyFc = z;
    }

    public final void setUserType(long j) {
        this.userType = j;
    }

    public LiveMessagePlatformBubbleConfig(int i, int i2, String str, String str2, int i3, long j, int i4, String str3, String str4, long j2, long j3, boolean z, boolean z2) {
        this.priority = i;
        this.lifetime = i2;
        this.position = str;
        this.filterReason = str2;
        this.showCount = i3;
        this.showDuration = j;
        this.scene = i4;
        this.strategyScene = str3;
        this.strategyDecisionKey = str4;
        this.orientation = j2;
        this.userType = j3;
        this.skipWatchEarlyFc = z;
        this.skipContinuousWatchFc = z2;
    }
}
