package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_jsb_thread_config_map")
public final class LiveHybridJsbThreadConfigMapSetting {
    public static final LiveHybridJsbThreadConfigMapSetting INSTANCE = new LiveHybridJsbThreadConfigMapSetting();
    public static final Map<String, String> DEFAULT = new LinkedHashMap();

    private final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_hybrid_jsb_thread_config_map", DEFAULT);
    }

    public final String getThreadType(String str) {
        Map<String, String> value = getValue();
        if (value != null) {
            return value.get(str);
        }
        return null;
    }
}
