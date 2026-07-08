package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttls_thread_priority_settings")
public final class TTLSThreadPrioritySettings {
    public static Map<String, Integer> configs;
    public static final TTLSThreadPrioritySettings INSTANCE = new TTLSThreadPrioritySettings();
    public static final Map<String, Integer> DEFAULT = new LinkedHashMap();

    public final Map<String, Integer> getThreadConfigs() {
        Map<String, Integer> map = configs;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Integer> map2 = DEFAULT;
        Map linkedHashMap = (Map) settingsManager.getValueSafely("ttls_thread_priority_settings", map2);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map2.put((String) entry.getKey(), Integer.valueOf((int) ((Number) entry.getValue()).doubleValue()));
        }
        configs = map2;
        return map2;
    }
}
