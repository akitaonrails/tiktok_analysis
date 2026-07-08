package com.bytedance.android.livesdk.livesetting.security;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_api_zti_config")
public final class LiveApiZtiConfigSetting {
    public static final LiveApiZtiConfigSetting INSTANCE = new LiveApiZtiConfigSetting();
    public static final Map<String, Boolean> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Boolean> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Map<String, Boolean> map = DEFAULT;
        Map<String, Boolean> map2 = (Map) settingsManager.getValueSafely("live_api_zti_config", map);
        return map2 != null ? map2 : map;
    }
}
