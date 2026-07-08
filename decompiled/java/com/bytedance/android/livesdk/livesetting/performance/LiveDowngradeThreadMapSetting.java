package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_downgrade_thread_map")
public final class LiveDowngradeThreadMapSetting {
    public static final LiveDowngradeThreadMapSetting INSTANCE = new LiveDowngradeThreadMapSetting();
    public static final Map<String, Double> DEFAULT = new LinkedHashMap();

    public final Map<String, Double> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_downgrade_thread_map", DEFAULT);
    }

    public final boolean enable() {
        Map<String, Double> value = getValue();
        return !(value == null || value.isEmpty());
    }
}
