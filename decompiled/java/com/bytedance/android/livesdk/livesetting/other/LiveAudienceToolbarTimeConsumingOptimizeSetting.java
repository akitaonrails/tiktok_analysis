package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_toolbar_time_consuming_optimize")
public final class LiveAudienceToolbarTimeConsumingOptimizeSetting {
    public static final ToolbarTimeConsumingOptimizeConfig DEFAULT;
    public static final LiveAudienceToolbarTimeConsumingOptimizeSetting INSTANCE = new LiveAudienceToolbarTimeConsumingOptimizeSetting();
    public static final ToolbarTimeConsumingOptimizeConfig value;

    static {
        ToolbarTimeConsumingOptimizeConfig toolbarTimeConsumingOptimizeConfig = new ToolbarTimeConsumingOptimizeConfig(false, false);
        DEFAULT = toolbarTimeConsumingOptimizeConfig;
        ToolbarTimeConsumingOptimizeConfig toolbarTimeConsumingOptimizeConfig2 = (ToolbarTimeConsumingOptimizeConfig) SettingsManager.INSTANCE.getValueSafely(LiveAudienceToolbarTimeConsumingOptimizeSetting.class);
        if (toolbarTimeConsumingOptimizeConfig2 != null) {
            toolbarTimeConsumingOptimizeConfig = toolbarTimeConsumingOptimizeConfig2;
        }
        value = toolbarTimeConsumingOptimizeConfig;
    }

    public final boolean optimizeCalculate() {
        return value.optimizeCalculate;
    }

    public final boolean optimizeInit() {
        return value.optimizeInit;
    }
}
