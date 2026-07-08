package com.bytedance.android.livesdk.performancetune.perfloadinfo;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_perf_tune_load_config")
public final class LivePerfLoadConfigs {
    public static final LivePerfLoadConfigs INSTANCE = new LivePerfLoadConfigs();
    public static final Map<String, LivePerfLoadInfo> DEFAULT = new LinkedHashMap();

    public final Map<String, LivePerfLoadInfo> getAllConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, LivePerfLoadInfo> map = DEFAULT;
        Map<String, LivePerfLoadInfo> map2 = (Map) settingsManager.getValueSafely("live_perf_tune_load_config", map);
        return map2 != null ? map2 : map;
    }
}
