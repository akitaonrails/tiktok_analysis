package com.bytedance.android.livesdk.livedecision;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_strategy_platform_all_config_map")
public final class LiveStrategyPlatformAllConfigMapSetting {
    public static final LiveStrategyPlatformAllConfigMapSetting INSTANCE = new LiveStrategyPlatformAllConfigMapSetting();
    public static final Map<String, Map<String, Object>> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Map<String, Object>> getValue() {
        Map<String, Map<String, Object>> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveStrategyPlatformAllConfigMapSetting.class);
        return map == null ? DEFAULT : map;
    }
}
