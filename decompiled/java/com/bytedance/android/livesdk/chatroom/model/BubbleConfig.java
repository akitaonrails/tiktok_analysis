package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public final class BubbleConfig {

    @C09CT("lifetime")
    public long lifetime;

    @C09CT("orientation")
    public long orientation;

    @C09CT("priority")
    public long priority;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("show_count")
    public long showCount;

    @C09CT("show_duration")
    public long showDuration;

    @C09CT("skip_continuous_watch_fc")
    public boolean skipContinuousWatchFc;

    @C09CT("skip_watch_early_fc")
    public boolean skipWatchEarlyFc;

    @C09CT("user_type")
    public long userType;

    @C09CT("position")
    public String position = "";

    @C09CT("filter_reason")
    public String filterReason = "";

    @C09CT("strategy_scene")
    public String strategyScene = "";

    @C09CT("strategy_decision_key")
    public String strategyDecisionKey = "";
}
