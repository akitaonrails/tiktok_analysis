package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostPerfAutoAdaptiveConfig {
    public static final TypeAdapter ADAPTER = new LiveHostPerfAutoAdaptiveConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("group")
    public StrategyGroup group;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "video_live";

    @C09CT("continuous_collect_metrics_count")
    public int continuousCollectMetricsCount = 4;

    @C09CT("downgrade_threshold")
    public int downgradeThreshold = 1;

    @C09CT("upgrade_threshold")
    public int upgradeThreshold = 2;

    @C09CT("downgrade_interval_time")
    public int downgradeIntervalTime = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("mid_device_score")
    public double midDeviceScore = 8.3d;

    @C09CT("low_device_score")
    public int lowDeviceScore = 6;

    public LiveHostPerfAutoAdaptiveConfig() {
        StrategyGroup strategyGroup = new StrategyGroup();
        strategyGroup.highDevice = null;
        strategyGroup.midDevice = null;
        strategyGroup.lowDevice = null;
        this.group = strategyGroup;
    }
}
