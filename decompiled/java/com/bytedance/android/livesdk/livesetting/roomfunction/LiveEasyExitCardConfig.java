package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEasyExitCardConfig {
    public static final TypeAdapter ADAPTER = new LiveEasyExitCardConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("exit_when_watch_depth")
    public LiveEasyExitCardDepthConfig depthConfig;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_swipe_count")
    public int enableSwipeCount;

    @C09CT("load_extra_card_on_demand")
    public boolean loadExtraCardOnDemand;

    @C09CT("exit_when_under_performance_level")
    public int performanceLevel;

    @C09CT("reuse_extra_card_container")
    public boolean reuseExtraCardContainer;

    @C09CT("strategy_control_swipe_count")
    public int strategyControlSwipeCount;

    public LiveEasyExitCardConfig() {
        this(false, -1, -1, 0, new LiveEasyExitCardDepthConfig(false, 0, 0, 0), false, false);
    }

    public LiveEasyExitCardConfig(boolean z, int i, int i2, int i3, LiveEasyExitCardDepthConfig liveEasyExitCardDepthConfig, boolean z2, boolean z3) {
        this.enable = z;
        this.strategyControlSwipeCount = i;
        this.enableSwipeCount = i2;
        this.performanceLevel = i3;
        this.depthConfig = liveEasyExitCardDepthConfig;
        this.loadExtraCardOnDemand = z2;
        this.reuseExtraCardContainer = z3;
    }
}
